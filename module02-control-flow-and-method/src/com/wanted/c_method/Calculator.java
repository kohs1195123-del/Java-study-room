package com.wanted.c_method;

public class Calculator {

    /* comment.  계산을 잘 할 수 있는 메소드들의 집합체*/

    // 전달 받은 두 수를 비교해서 최솟값 반환하는 메소드
    public int minNumberOF(int first, int second) {
        // first 는 100 , second 는 50 이 들어있는 상태

        return (first > second) ?  second : first;
    }

    // 전달 받은 두 수를 비교해서 최솟값 반환하는 메소드
    public static int maxNumberOF(int first, int second) {

        // 전달 받은 두 수를 비교해서 최댓값 반환하는 메소드

        return (first > second) ?  first : second;
    }

}

