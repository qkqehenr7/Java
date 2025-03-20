package com.grepp.basic.c_prepare;

public class A_Print {

    public static void main(String[] args) {

        // " : 문자열 표현
        // ' : 문자 표현

        // NOTE CA01 escape sequence : 특정 문자를 표현하기 위한 특별한 문자열. \ prefix로 붙인다.
        // \\ : 문자 그대로의 \
        // \n : 줄바꿈
        // \r : carriage return : 줄의 처음으로 이동
        // * \r\n : 옛날 줄바꿈
        // \t : tab
        // \', \* : 문자 그대로의ㅡ ', *

        // \"영수증\"
        // System.out.println("\\\"영수증\\\"");
        System.out.println("\\\"\n\t\'영수증\'\\\"");

        // NOTE CA02 print : 출력
        // println : 출력 후 줄바꿈

        System.out.print("print\n");
        System.out.println(" hello world");

        // NOTE CA03 printf : 출력 형식을 지정
        // %d : 정수형
        // %c : 문자
        // %s : 문자열
        // %f : 실수형
        // %b : 논리형

        System.out.printf("주문자명 : %s\n", "최동준");

        // 정렬 : %5d, %-5d, %.2f
        // %5d : 5칸 공간 확보, 우측 정렬
        // %-5d : 5칸 공간 확보, 좌측 정렬
        // %.2f : 소수점 두 자리까지 표현

        System.out.printf("상품코드 : %8s | 가격 : %10d | 할인 : %.2f | 품절여부 : %b\n", "p101", 15000, 0.2, true);
        System.out.printf("상품코드 : %8s | 가격 : %10d | 할인 : %.2f | 품절여부 : %b\n", "p20333", 8000, 0.22324, true);

        System.out.printf("상품코드 : %-8s | 가격 : %10d | 할인 : %.2f | 품절여부 : %b\n", "p101", 15000, 0.2, true);
        System.out.printf("상품코드 : %-8s | 가격 : %10d | 할인 : %.2f | 품절여부 : %b\n", "p20333", 8000, 0.22324, true);
    }

}
