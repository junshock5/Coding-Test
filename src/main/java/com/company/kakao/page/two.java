package com.company.kakao.page;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class two {
    public static String RemoveSpecialCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')
                    || (str.charAt(i) >= 'A' && str.charAt(i) <= 'z')
                    || (str.charAt(i) == '.' || str.charAt(i) == '_')) {
                sb.append(str.charAt(i));
            } else if(Character.getType(str.charAt(i)) == 5){
                i+=2;
            }
            else
                sb.append(" ");
        }
        return sb.toString().replace(".", " ");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i = 1; i <= Integer.parseInt(input); ++i) {
            String input2 = br.readLine();
            System.out.println(RemoveSpecialCharacters(input2));
        }


    }
}
