package com.grepp.basic.g_class;


// NOTE G01 class
// class : 속성(데이터) + 기능(함수)
// class를 만든다는 것은 새로운 타입을 만든다는 것.
// class 이름 == type 이름

// class의 member
// member :
//      class(static) 변수, class(static) method
//          class에 속하는 변수
//          class의 모든 인스턴스가 공유하는 변수와 메서드
//      instance 변수, instance method
//          각 instanace에 속하는 변수

// static : 정적 메모리 할당 방식
//          프로그램이 시작되는 시점에 메모리에 할당되어, 프로그램 종료까지 메모리에서 해제되지 않는 방식
//          statoc 키워드를 사용한 변수는 static 메모리 영역에 올라간다.

// 동적 메모리 할당 방식
// 프로그램 실행 중에 메모리에 할당되거나 해제(GC, 코드블록이 종료)되는 방식
// 동적 메모리 할당 방식을 사용하는 메모리 공간 : stack 영역, heap 영역

// 객체 생성 이후 인스턴스 변수를 초기화하지 않으면 JVM의 기본값으로 초기화
// 숫자 타입 : 0
// 참조형 타입 : null
// 문자 타입 : 유니코드 0번 (ascii code)
// 논리 타입 : false
public class Coffee {
    String name;
    double price;
    int cost;
    int stock;
    int safetyStock;
    int salesCnt;
    boolean soldOut;

    static char type = 'T';

    // 상수 : 언제나 같은 값 ex) PI
    static final String APP_KEY = "A1293818283";

    // NOTE G02 생성자
    // 생성자 : 사용자 정의 타입을 Heap 영역의 메모리에 올릴 때, 인스턴스 변수를 초기화하기 위해 사용하는 메서드
    // 생성자를 하나도 생성하지 않으면, 자바의 컴파일러가 기본생성자(매개변수가 0개)를 자동으로 생성

    public Coffee(String name){
        this.name = name;
    }

    public Coffee(String name, double price, int cost, int stock, int safetyStock, int salesCnt,
        boolean soldOut) {
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.stock = stock;
        this.safetyStock = safetyStock;
        this.salesCnt = salesCnt;
        this.soldOut = soldOut;
    }

    public static void info(){
        System.out.println("Coffee 클래스입니다.");
    }
    public void address(){
        System.out.println("this : " + System.identityHashCode(this));
    }
}
