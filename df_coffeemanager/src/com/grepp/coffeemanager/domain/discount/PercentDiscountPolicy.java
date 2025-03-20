package com.grepp.coffeemanager.domain.discount;

import com.grepp.coffeemanager.domain.order.Order;

public class PercentDiscountPolicy implements DiscountPolicy{

    @Override
    public int getDiscountAmount(Order order) {

        // .values() 메서드는 enum을 배열로 변환
        PercentDiscountLevel[] conditions = PercentDiscountLevel.values();
        for (PercentDiscountLevel condition : conditions) {
            if (condition.checkRange(order)){ // 할인 금액 내에 들어올 경우 할인 금액을 반환
                double discountAmount = order.getOrderPrice() * condition.rate();
                return (int) discountAmount;
            }
        }
        return 0;
    }
}
