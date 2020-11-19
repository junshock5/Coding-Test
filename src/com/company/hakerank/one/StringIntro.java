package com.company.hakerank.one;

import java.util.Scanner;

class StringIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int sumLength = A.length() + B.length();

        String lexicographically = "";
        if (A.compareTo(B) <= 0)
            lexicographically = "No";
        else
            lexicographically = "Yes";

        String A1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B1 = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(sumLength);
        System.out.println(lexicographically);
        System.out.println(A1 + " " + B1);

    }
}