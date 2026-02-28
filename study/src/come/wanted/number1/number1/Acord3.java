package come.wanted.number1.number1;

import java.util.Scanner;

public class Acord3 {
    public static void main(String[] args) {

        String[] strArr = new String[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < strArr.length; i++) {
            System.out.print((i + 1) + "번째 문자열 입력: ");
            strArr[i] = sc.nextLine();
        }
        for(int i = 0; i < strArr.length; i++) {
            int count = 0;
            for (int j = 0; j < strArr[i].length(); j++){
                if (strArr[i].charAt(j)=='a'){
                    count++;

                }
            }
            System.out.println(strArr[i] + "-> 포함된 'a'개수:" + count + "개");

        }




    }
}
