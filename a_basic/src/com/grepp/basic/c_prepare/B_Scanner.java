package com.grepp.basic.c_prepare;

// NOTE CB00 Package : 연관된 클래스들의 그룹
// full qualified name 대신 클래스명을 사용하기 위해 미리 full qualified name을 선언
import java.util.Scanner;

// 자바에서 Class의 이름은 중복될 수 없다.
// 패키지명 : com.grepp.basic.c_prepare
// 클래스명 : B_Scanner
// full qualified name : com.grepp.basic.c_prepare.B_Scanner

// 패키지명 규칙 : 회사의 도메인 + 프로젝트명
// ex) com.naver.pay.a_variable
public class B_Scanner {

    public static void main(String[] args) {

        // NOTE CB01 Scanner : 입력받은 값을 읽고 처리하는 객체
        // System.in : 시스템의 표준 입력 장치 : 키보드

        Scanner sc = new Scanner(System.in);
        System.out.println("email password : ");

        // sc.next():
        // 1. 사용자의 입력을 대기한다.
        // 2. 입력된 값을 공백문자를 기준으로 하나씩 반환한다.
        String email = sc.next();
        System.out.println(email);

        String password = sc.next();
        System.out.println(password);
    }

}
