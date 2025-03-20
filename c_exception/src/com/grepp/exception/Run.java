package com.grepp.exception;

import com.grepp.exception.custom.TimeOutException;
import java.net.MalformedURLException;

public class Run {

    // main 메서드에서 마저 throws를 하면 JVM이 예외처리를 해준다.
    public static void main(String[] args) {

        A_Exception ex = new A_Exception();
        //ex.arithEx();
        //ex.malformedURLEx();

        ex.throwNotValidEx(2311);
        System.out.println("예외처리 이후의 코드");

        try {
            ex.throwTimeOutEx();
            System.out.println("클라이언트야 안녀엉~~~!!!");
        } catch (TimeOutException e) {
            System.out.println("catch 블록입니다.");
            System.out.println("죄송합니다. 연결에 실패했습니다. 라고 사용자에게 알린다.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("try-catch 이후 코드");
    }

}

// runtimeException에서 왜 printstacktrace로 ?
