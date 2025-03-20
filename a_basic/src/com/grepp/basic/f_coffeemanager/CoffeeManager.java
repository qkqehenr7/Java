package com.grepp.basic.f_coffeemanager;

import java.util.Scanner;

public class CoffeeManager {

    public static void main(String[] args) {app();}

    private static void app() {
        Scanner sc = new Scanner(System.in);

        String[] names = {"americano", "mocha", "latte"};
        int[] prices = {1000, 2000, 3000};
        int[] costs = {500, 1000, 1500};
        int[] stocks = {1, 10, 10};
        int[] safetyStocks = {3, 3, 3};
        int[] saleCnt = {0, 0, 0};

        int balance = 100000; // 잔고
        int expensesAmount = 0; // 매출
        int salesAmount = 0; // 지출

        while (true) {
            System.out.println("\n=== menu ===\n");
            System.out.println("판매등록(1)");
            System.out.println("현황(2)");
            System.out.println("종료(3)");
            System.out.println("입력: ");
            int menu = sc.nextInt();

            if (menu == 3) {
                System.out.println(" system: 종료합니다.");
                break;
            }

            if (menu < 1 || menu > 3){
                System.out.println(" system: 잘못 입력하였습니다.");
                break;
            }

            if (menu == 1) {
                System.out.println("\n=== list ===\n");
                for (int i = 0; i < names.length; i++) {
                    System.out.println(names[i] + "(" + i + ")");
                }

                System.out.print("상품코드: ");
                int code = sc.nextInt();
                System.out.print("판매량: ");
                int orderCnt = sc.nextInt();

                if (code < 0 || code >= names.length) {
                    System.out.println("잘못된 음료 코드입니다.");
                    continue;
                }

                if (orderCnt <= stocks[code]) {
                    // 판매
                    // 재고 반영
                    stocks[code] -= orderCnt;
                    // 판매량 반영
                    saleCnt[code] += orderCnt;
                    // 잔고 반영
                    balance += prices[code] * orderCnt;
                    // 매출 반영
                    salesAmount += prices[code] * orderCnt;
                } else {
                    // 매입
                    // 매입금액 산정
                    int purchasePrice = costs[code] * orderCnt;

                    if (purchasePrice > balance) {
                        System.out.println(" system: 주문을 취소합니다.");
                        continue; // while 문의 조건식으로 돌아감.
                    }

                    // 매입 + 판매
                    System.out.println("system: " + names[code] + " 재고 " + orderCnt + "개 확보합니다.");
                    // 매입
                    // 재고 반영
                    stocks[code] += orderCnt;
                    // 잔고 반영
                    balance -= purchasePrice;
                    // 지출 반영
                    expensesAmount += purchasePrice;

                    // 판매
                    // 재고 반영
                    stocks[code] -= orderCnt;
                    // 판매량 반영
                    saleCnt[code] += orderCnt;
                    // 잔고 반영
                    balance += prices[code] * orderCnt;
                    // 매출 반영
                    salesAmount += prices[code] * orderCnt;
                }

                // 안전재고 기준선 확인
                if (stocks[code] <= stocks[code]) {
                    // 매입금액 산정
                    int safetyPurchasePrice = safetyStocks[code] * 2 * costs[code];
                    if (balance >= safetyPurchasePrice) {
                        // 매입
                        // 재고 반영
                        stocks[code] += safetyStocks[code] * 2;
                        // 잔고 반영
                        balance -= safetyPurchasePrice;
                        // 지출 반영
                        expensesAmount += safetyPurchasePrice;
                    } else {
                        // 매입 실패
                        System.out.println(" system: 잔액부족으로 안전재고 확보 실패");
                    }
                }

                System.out.println("\n 제품명 : " + names[code]
                    + " \n 판매가 : " + prices[code]
                    + " \n 판매수량 : " + orderCnt
                    + " \n 결재금액 : " + prices[code] * orderCnt
                    + " \n 남은 재고 : " + stocks[code]
                    + " \n 잔고 : " + balance
                    + " \n 매출 : " + salesAmount
                    + " \n 지출 : " + expensesAmount

                );
//                else {
//                    for (int i = 0; i < names.length; i++) {
//                        System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", names[code], stocks[code], saleCnt[code]);
//                    }
//                }
            }
        }
    }
}