package com.grepp.oop.d_inheritance.c_after;

public class Desktop extends Computer{

    public boolean allInOne;

    public Desktop(String brand, String name, int price, String cpu, boolean allInOne) {
        super(brand, name, price, cpu);
        this.allInOne = allInOne;
    }

    @Override
    public void on() {
        System.out.println("allInOne : " + allInOne);
        super.on();
    }

    @Override
    public String toString() {
        return "Desktop{" +
            "allInIne=" + allInOne +
            ", cpu='" + cpu + '\'' +
            ", brand='" + brand + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
