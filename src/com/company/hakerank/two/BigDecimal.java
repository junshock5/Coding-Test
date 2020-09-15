package com.company.hakerank.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimal {

    public static void main(String[] args) {

        // String의 ArrayList 객체 생성
        ArrayList<java.math.BigDecimal> intList = new ArrayList<java.math.BigDecimal>(); // new ArrayList<>() 도 가능

        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            //intList.add(new BigDecimal(s[i]));
        }
        sc.close();

//        for (int i = 0; i < n; i++) {
//            intList.add(new BigDecimal(s[i]));
//        }
//        Collections.reverse(intList);
//        Collections.sort(intList);
//
//        for (int i = 0; i < n; i++) {
//            s[i]=intList.get(i).toString();
//        }

        //Arrays.sort(s);
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 == null) {
                    return 1;
                }
                if (o2 == null) {
                    return -1;
                }
                java.math.BigDecimal bg1, bg2;
                bg1 = new java.math.BigDecimal(o1);
                bg2 = new java.math.BigDecimal(o2);
                return bg2.compareTo(bg1);
            }});

       // createSorted


        //Output
        for (int i = 0; i < n; i++) {
            //System.out.println(intList.get(i));
            System.out.println(s[i]);

        }
    }
}