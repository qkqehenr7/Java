package com.grepp.basic.d_control;

import java.util.Scanner;

public class F_star {

    public static void main(String[] args) {
        //q1();
        //q2();
        //q3();
        //q4();
        //q5();
        //q6();
        q7();
    }

    private static void q7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 0; i < (2 * num - 1); i++) { // index 0부터 8까지 총 9번
            int row = (i < num) ? i : (num * 2 - i);

            for (int j = 0; j < 2 * num; j++) {
                if (j < row || j >= 2 * num - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static void q6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num * 2; j++) {
                if ((j < i) || (j >= num * 2 - i)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = num; i >= 0; i--) {
            for (int j = 0; j < num * 2; j++) {
                if ((j < i) || (j >= num * 2 - i)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void q5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 0; i < num * 2 - 1; i++) {
            if (i < num){
                for (int j = 0; j < num * 2 - 1; j++) {
                    if ((j >= 4 - i) && (j <= 4 + i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 0; j < num * 2 - 1; j++) {
                    if ((j >= 4 - (num * 2 - i - 2)) && (j <= 4 + (num * 2 - i - 2))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    private static void q4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num * 2 - 1; j++) {
                if ((j >= 5 - i) && (j <= 5 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    System.out.print(i+1);
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();

        System.out.print("col: ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
