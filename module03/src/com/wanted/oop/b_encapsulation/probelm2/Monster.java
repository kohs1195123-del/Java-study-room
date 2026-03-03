package com.wanted.oop.b_encapsulation.probelm2;

public class Monster {

    /* 몬스터의 이름 , 몬스터의 체력*/
  //  String name;
   // int hp;

    //개발자들의 변심으로 인해 name->kinds로 변수명을 변경한다.
    String kinds;
    int hp;

    //hp를 설정하는 메소드
    // 매게변수 전다받은 hp 값을 변경햐주는 메소드
    // 양수의 경웨는 전달 받은 값으로 세팅
    // 음수의 경우에는 0으로 변경
    public void  sethp(int hp) {
        if (hp >0) {
            System.out.println(" 정상적인 값입니다. 몬스터 체력을  " + hp + " 로 설정합니다");
            /*  this : 인스턴스가 생성 될 떄, 자신의 주소를 저장하는 레퍼런스 변수이다.
            * 지역변수오 전역변수의 이름이 같을 때 지역변수를 원적으로 접근하기ㅒㄸ문에
            * 전역변수에 값을 대입하기 위해서는 this . 을 명시헤야한다
            * */
            this.hp= hp;
        } else {
            System.out.println("삐빅.. 오류 발생 hp를 0으로 세팅합니다.");
            this.hp =0;

        }
    }

}
