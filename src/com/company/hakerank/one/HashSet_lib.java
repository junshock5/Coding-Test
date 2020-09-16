package com.company.hakerank.one;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet_lib {

    public static void main(String[] argh) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        HashSet<String> set = new HashSet<String>();//HashSet생성

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();

        }

//Write your code here
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + pair_right[i]);
            System.out.println(set.size());
        }
    }
}