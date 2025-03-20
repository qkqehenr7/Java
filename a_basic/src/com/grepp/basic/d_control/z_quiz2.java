package com.grepp.basic.d_control;

import java.util.Scanner;

public class z_quiz2 {

    public static void main(String[] args) {
        quiz();

    }

    public static void quiz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1P :");
        String p1 = sc.next();
        System.out.print("2P :");
        String p2 = sc.next();

        if (p1.equals(p2)){
            System.out.println("비겼습니다.");
            return; // 함수 종료
        }

        String result = winOrLose(p1, p2);
        System.out.println(result);

    }

    private static String winOrLose(String p1, String p2) {
        if (p1.equals("가위") && p2.equals("보")){
            return "이겼습니다.";
        } else if (p1.equals("바위") && p2.equals("가위")) {
            return "이겼습니다.";
        } else if (p1.equals("보") && p2.equals("바위")) {
            return "이겼습니다.";
        }
        return "졌습니다.";
    }
}

