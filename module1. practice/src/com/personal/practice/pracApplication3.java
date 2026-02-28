package com.personal.practice;

import java.util.Scanner;

public class pracApplication3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("개인정보 입력");

        System.out.print("이름:");
        String a = sc.nextLine();

        System.out.print("나이:");
        int b = sc.nextInt();

        System.out.print("성별:");
        String c = sc.next();

        System.out.print("키(cm)");
        double d = sc.nextDouble();

        System.out.println("개인정보");
//        System.out.println("이름:" + a + "님:");
//        System.out.println("나이:" + b + "살:");
//        System.out.println("성별:" + c);
//        System.out.println("키:" + d + "cm;");
        System.out.println(b+"살 "+c+a+"님 키가"+d+"cm 이시군요 !");


        int aa =10;
        System.out.println(aa);

    }






}
