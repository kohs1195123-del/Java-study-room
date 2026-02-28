package com.wanted.object.string;

public class Application01 {

    public static void main(String[] args) {


        /* comment.
         *   자료형은 크게 2가지 종류가 있다
         * 1. 기본자료형 (ex : int ,  double, boolean 등)
         * 2. 참조자료형
         * 3. 사용자 정이의 자료형
         * */
        /* comment. String 에서 사용되는 다양한 매소드*/
        String str1 = "apple";

        // length() : 길이
        // charAt(index) : 문자열을 문자로 변환

        System.out.println(str1.length());
        // "apple" -> 'a' ,'p 이런식으로 분리
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + "): " +str1.charAt(i));
        }

        String trimStr = "   java   "; // 앞뒤 3번
        System.out.println("공백 자르기 전 확인: #" + trimStr + "#");
        System.out.println("공백 자르기 후 확인: #" + trimStr.trim() + "#");

    }
}
