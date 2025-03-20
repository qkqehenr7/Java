package com.grepp.coffeemanager.domain.multilingual.payment;

public abstract class PaymentDecorator implements PaymentTranslator{

    protected PaymentTranslator target; // target에는 PaymentDecorator의 자식 클래스들이 올 수 있음

    public PaymentDecorator(PaymentTranslator target) {
        this.target = target;
    }
}
