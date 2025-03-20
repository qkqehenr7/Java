package com.grepp.basic.d_control;

import java.util.Scanner;

public class C_ifelseif {

    // NOTE DB01 다중조건문
    public static void main(String[] args) {
        // 사용자로부터 점수를 입력받아 등급을 출력합니다.
        // 점수가 70점 미만이면 F입니다.
        // 100점이면 A, 90점대면 B, 80점대면 C, 70점대면 D등급을 부여하고 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("점수: ");
        int score = sc.nextInt();


        // 입력값 : 0 ~ 100
        if (score == 100){
            System.out.println("A");
        } else if (score >= 90){
            System.out.println("B");
        } else if (score >= 80) {
            System.out.println("C");
        } else if (score >= 70) {
            System.out.println("D");
        } else{
            System.out.println("F");
        }

    }

}
