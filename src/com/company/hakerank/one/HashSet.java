package com.company.hakerank.one;

import java.util.Scanner;
import java.util.Set;

public class HashSet {

    public static void main(String[] argh) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        java.util.HashSet<String> set = new java.util.HashSet<String>();//HashSet생성

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();

        }

//Write your code here
        Set<String> fruits = new java.util.HashSet<String>();
        for (int m = 0; m < t; m++) {
            fruits.add(pair_left[m] +" "+pair_right[m]);
            System.out.println(fruits.size());
        }
    }
}