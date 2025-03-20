package com.grepp.basic.c_prepare;

public class C_문자열 {

    // NOTE CC01 String
    // 참조형 타입 : primitive type을 제외한 모든 타입
    // new 연산자 : heap 영역에 동적으로 데이터를 저장할 공간을 할당받고, 주소를 변수에 연결해주는 연산자
    // 타입 변수명 = new 생성자 호출
    public static void main(String[] args) {

        String hello = new String("hello world");
        String hi = new String("hello world");

        // 같은 문자라도 힙 영역의 주소를 비교하므로 서로 다르다.
        System.out.println(System.identityHashCode(hello));
        System.out.println(System.identityHashCode(hi));
        System.out.println(hello == hi);

        // 모든 참조형 변수는 등위비교를 할 때, equals() 메서드로 비교해야 한다.
        System.out.println(hello.equals(hi));

        String a = "hi";
        String b = "hi";

        System.out.println("=== literal 초기화 ===");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(a));
        // System.out.println(a == b); 왜 이거 안되는지 다시 설명좀 > 안되는 건 아니지만 특이케이스 이므로
        // a.equals(b) 사용을 습관화
        // Heap 영역에 String constant pool이라는 것이 따로 있음. 여기에 만약 'CODE' 라는 문자열이 없다면
        // 집어 넣음. 오직 리터럴로 변수를 초기화할 때만. 근데 인텔리제이는 리터럴 초기화를 권장? 그럼 괜찮지 않나?
        // 스택에 4바이트 공간이 할당되어 주소가 들어가진 않는건가?
        System.out.println(a.equals(b));

    }

}
