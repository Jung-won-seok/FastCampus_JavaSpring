package fc.java.course2.part1;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {
        //HelloWorld라는 문자열을 생성하세요.
        String str = "HelloWorld";
        System.out.println(str.charAt(1)); //'e'
        System.out.println(str.replaceAll("o","X"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,8));
        System.out.println(str.indexOf("Wor")); //못찾으면 -1 리턴
        for(int i=0 ; i<str.length() ; i++){
            System.out.println(str.charAt(i));
        }
    }
}
