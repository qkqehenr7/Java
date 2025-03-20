package com.grepp.basic.g_class;

import com.grepp.basic.g_coffeemanager.CoffeeManager;

public class Run {

    public static void main(String[] args) {
        //init();
        classMember();
    }

    private static void classMember() {
        // type에 속한다. -> 인스턴스를 생성하지 않고 타입 정보만으로 사용할 수 있다.
        System.out.println(Coffee.type);
        Coffee.info();


        Coffee.type = 'F';
        Coffee americano = new Coffee("아메리카노");
        Coffee mocha = new Coffee("모카");

        System.out.println(americano.type);
        System.out.println(mocha.type);
        Coffee.info();

    }

    private static void init() {
        Coffee coffee = new Coffee(
            "americano",
            1000,
            500,
            10,
            3,
            0,
            false
        );

        System.out.println(coffee.name);
        System.out.println(coffee.price);
        System.out.println(coffee.type);

        coffee.type = 'Q';
        System.out.println(coffee.type);

    }
}
// 객체에는 항상 this 라는 메모리 주소를 담는 공간이 존재?