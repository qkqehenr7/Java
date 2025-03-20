package com.grepp.coffeemanager.domain.order;

public class Orderstatus {

    public static final Orderstatus OK = new Orderstatus(0, "주문 생성 성공");
    public static final Orderstatus FAIL_SOLD_OUT = new Orderstatus(1, "재고 부족으로 주문을 취소합니다.");
    public static final Orderstatus FAIL_SEASON = new Orderstatus(2, "비시즌 입니다.");

    private int code;
    private String desc;

    private Orderstatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public boolean isOK(){
        return code == 0;
    }

    public String desc(){
        return desc;
    }
}
