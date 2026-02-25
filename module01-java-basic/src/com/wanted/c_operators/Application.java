package com.wanted.c_operators;

public class Application {

    public static void main(String[] args) {

        //연산자 테스트 데이터
        int a =10;
        int b=3;

        // +, -, *, %, /
        // 산술 연산
        // 문자열 연산은 문자열 합치기에 특히 유희해야 한다.
        System.out.println("덧셈 : " + (a + b));
        System.out.println("나늣셈 : " + (a/b));
        System.out.println("나머지 : " + (a%b));

        //  비교 연산
        // 두 값을 비교하여 참(true), 거짓(False) 를 반환하는 연산자.
        // ==, != , < , > , <= , >=

        boolean isGreater = a > b;
        System.out.println("isGreater = " + isGreater);

        // 논리 연산
        // 하나 이상의  " 조건을 결합" 하여 최종적으로 참 또는 거짓을 평가한다.
        // &&(논리 And) , ||(논리 or) , !(논리 Not)

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("둘 다 참인가? : " + (isFalse && isFalse));
        System.out.println("둘중 하나는 거짓인가? : " + (isFalse && isFalse));
        System.out.println("NOT 은 너가 거짓이라는 거 부정한다 :  " + !isFalse);

        // 증감 연산
        // 변수의 값을  1씩 증가 시키거나 감소시키는 연산자
        // ++(증가) , --(감소)
        //

        int age = 20;
        System.out.println("age = " + (++age));
        System.out.println("age = " + (age++));

        System.out.println("age = " + age);





    }
}
