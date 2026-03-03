package com.wanted.oop.b_encapsulation.problem_solved;

public class Application {
    public static void main(String[] args) {

        /* comment 캡슐화 적용 후 앞서 확인한 문제와 바교해본다.
        *  problem 3번에서는 method 를 활용해서 필드에 접근하는 것이 아닌
        *  메소드를 통해서 값을 초기화 한다
        *  다만 여전히
        * */
        // 1번 몬스터 생성
        Monster monster1 = new Monster();
        monster1.setName("또도가스");
        monster1.hp = 200;

        monster1.getInfo();

        // 2번 몬스터 생성
        Monster monster2 = new Monster();
        monster1.setName("갸라도스");
        monster2.hp = -200;

        monster2.getInfo();

        /* comment. 문제 상황발생!!
        *   검증되지 않은 값을 넣을 떄 문제가 발생 할 수 있다*/



        // 3번 몬스터 생성
        Monster monster3 = new Monster();
        monster3.setName("피카츄");
        monster3.sethp(-200);

        monster3.getInfo();

        /* comment. 이제ㅡ거이 문제가 해결됐다
        *   다만 아직까지 문제가 되는 부분은
        *   여전히 필드에 접근할 수 있다는 것이다.
        * */

        monster3.hp = -5500;
        monster3.getInfo();


    }
}
