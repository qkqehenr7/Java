package com.grepp.oop.f_interface;

public class Run {

    public static void main(String[] args) {
        StarLink smartPhone = new SmartPhone(
            "애플",
            "아이폰",
            1000000,
            "스냅드래곤",
            "SKT");

        smartPhone.connect();
        smartPhone.disconnect();
        StarLink.callAgency();

        SmartPhone phone =(SmartPhone) smartPhone;
        phone.send();
        phone.receive();
        phone.encrypt();

    }

}
