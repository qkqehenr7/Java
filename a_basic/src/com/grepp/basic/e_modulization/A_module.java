package com.grepp.basic.e_modulization;

public class A_module {

    public static void main(String[] args) {

        // 1. 111, 1111, 11111 중에서 최솟값, 최댓값, 중간값을 구하는 로직을 작성하시오.
        System.out.println("최솟값: " + min(111, 1111, 11111));
        System.out.println("최댓값: " + max(111, 1111, 11111));
        System.out.println("중간값: " + median(111, 1111, 11111));

        System.out.println("=============================");

        // 2. 222, 2222, 22222 중에서 최솟값, 최댓값, 중간값을 구하는 로직을 작성하시오.
        System.out.println("최솟값: " + min(222, 2222, 22222));
        System.out.println("최댓값: " + max(222, 2222, 22222));
        System.out.println("중간값: " + median(222, 2222, 22222));

        System.out.println("=============================");

        // 3. 333, 3333, 33333 중에서 최솟값, 최댓값, 중간값을 구하는 로직을 작성하시오.
        System.out.println("최솟값: " + min(333, 3333, 33333));
        System.out.println("최댓값: " + max(333, 3333, 33333));
        System.out.println("중간값: " + median(333, 3333, 33333));
    }

    // NOTE EA00 모듈 : 작업을 수행하는 독립적인 단위
    // 모듈회를 하는 이유:
    // 1. 재사용성
    // 2. 가독성
    // 3. 유지보수가 용이하다.
    // 4. 하나의 모듈이 하나의 책임만 가지도록 작성

    // NOTE EA01
    // 매개변수 : 함수 외부에서 전달되는 값을 받기 위한 변수
    // 전달인자 : 매개변수에 전달되는 값
    // 반환값 : 함수가 종료될 때 함수의 호출부로 전달할 값, 메서드 선언부의 return type을 명시적으로 저장해야한다.
    public static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static int median(int a, int b, int c) {
        int max = max(a, b, c);
        int min = min(a, b, c);

        if (a != max && a != min) {
            return a;
        }
        if (b != max && b != min) {
            return b;
        }
        return c;
    }
}

// ctrl + alt + l : 자동 줄 맞춤
// if 문을 사용하면 꼭 return아 있어야 한다. 조건문 내에만 return을 사용한다면 missing return statement 발생
