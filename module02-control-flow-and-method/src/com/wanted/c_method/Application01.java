
package com.wanted.c_method;

public class Application01 {

    public static void main(String[] args) {
        // 1. 먼저 본인 클래스를 객체로 만듭니다.
        Application01 app = new Application01();

        // 2. 에러 났던 부분: 메서드 이름 뒤 괄호() 안에 숫자 두 개를 꼭 넣어야 합니다.
        // 예: 10과 20을 더하고 싶을 때
        app.sumTwoNumber(10, 20);

        // 변수를 만들어서 넣어도 됩니다.
        int a = 100;
        int b = 200;
        app.sumTwoNumber(a, b);
    }

    /**
     * 숫자 두 개를 전달받아 합계를 출력하는 메서드
     * @param first 첫 번째 정수
     * @param second 두 번째 정수
     */
    public void sumTwoNumber(int first, int second) {
        int result = first + second;
        System.out.println("두 수의 합은: " + result);
    }
}