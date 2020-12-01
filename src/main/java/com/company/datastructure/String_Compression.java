package com.company.datastructure;

import java.util.Scanner;

public class String_Compression {

    //문자열 압축 전체길이의 절반 개수부터 가능한지 확인.
    //1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이
    //압축 문자열중 길이가 가장 짤은것을 return

    public static boolean isInteger(String input) { //Pass in string
        try { //Try to make the input into an integer
            Integer.parseInt(input);
            return true; //Return true if it works
        } catch (Exception e) {
            return false; //If it doesn't work return false
        }
    }

    public static int compoundString(String result) {
        StringBuilder resultBuilder = new StringBuilder(result);
        for (int i = 0; i < resultBuilder.length()-1; ++i) {
            if (resultBuilder.charAt(i) == resultBuilder.charAt(i + 1))  //문자가 뒤에 꺼랑 같고
            {
                if(i==0)
                {
                    resultBuilder.setCharAt(i,Character.forDigit(2, 10));
                    continue;
                }
                if (isInteger(Character.toString(resultBuilder.charAt(i-1))) == true) {
                    resultBuilder.setCharAt(i-1,Character.forDigit(Character.getNumericValue(resultBuilder.charAt(i-1))+1, 10));
                    resultBuilder.deleteCharAt(i);
                    i=i-1;
                }
                else
                {
                    resultBuilder.setCharAt(i,Character.forDigit(2, 10));
                }
            }
        }
        System.out.println(resultBuilder);

        return resultBuilder.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        System.out.println(compoundString(string));

    }
}
