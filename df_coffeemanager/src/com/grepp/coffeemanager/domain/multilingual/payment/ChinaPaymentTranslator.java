package com.grepp.coffeemanager.domain.multilingual.payment;

import com.grepp.coffeemanager.domain.payment.Payment;

public class ChinaPaymentTranslator extends PaymentDecorator{

    public ChinaPaymentTranslator(PaymentTranslator target) {
        super(target);
    }

    @Override
    public String translateOrderName() {
        String orderName = target.translateOrderName();
        Payment payment = origin();

        // NOTE MC01 : 디미터법칙
        // 객체의 메서드를 호출할 때 .은 한번만 사용한다.
        // 도메인 객체가 아니라, 데이터 클래스(VO, DTO) 라면 지키지 않아도 상관없다.
        String coffeeCnt = payment.getCoffeeName();
        int orderCnt = payment.getOrderCnt();
        orderName += ", " + orderCnt + " 杯 " + coffeeCnt;
        return orderName;
    }

    @Override
    public String translatePaymentsPrice() {
        Payment payment = origin();
        double paymentPrice = payment.getPaymentPrice();
        double wian = paymentPrice / 200;
        return target.translatePaymentsPrice() + ", " + String.format("%.2f wian", wian);
    }

    @Override
    public Payment origin() {
        return target.origin();
    }
}
