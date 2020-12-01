package com.company.hakerank.one;

import java.util.Scanner;

public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        java.math.BigInteger d1 = scan.nextBigInteger();
        java.math.BigInteger d2 = scan.nextBigInteger();


        System.out.println(d1.add(d2));
        System.out.println(d1.multiply(d2));
    }
}