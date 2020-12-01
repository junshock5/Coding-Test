package com.company.hakerank.one;

import java.util.Scanner;

class StringCharAt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        for (int i = 0; i < S.length(); ++i) {
            if (i >= start && i <= end+1) {
                System.out.print(S.charAt(i));
            }
        }

    }
}