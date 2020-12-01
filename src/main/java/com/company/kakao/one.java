package com.company.kakao;

import java.util.Scanner;


class one {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double maxLength = Math.pow(10, 5);
        //String[] strings = input.split()


        char[] alpabat = new char[26];
        Integer[] alpabatValues = new Integer[26];

        for (int i = 0; i < alpabat.length; i++) {
            alpabat[i] = (char) ('A' + i);
            alpabatValues[i] = ('A' + i);
        }

        int first = alpabatValues[0];
        long result = 0;

        // 처리하면 된다.
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; ++j) {
                if (s.charAt(i) == alpabat[j]) {
                    if (Math.abs(alpabatValues[j] - first) > 13) {
                        result += 26 - Math.abs(alpabatValues[j] - first);
                    } else
                        result += Math.abs(alpabatValues[j] - first);
                    first = alpabatValues[j];
                }
            }


        }
        System.out.println(result);
        //return result;


    }
}