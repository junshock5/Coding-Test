package com.company.hakerank.one;

import java.util.Scanner;

public class Array_1D {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.close();

        int[] a = null;
        a = new int[n];
        for(int i=0; i<n; ++i)
        {
           a[i]=scan.nextInt();
        }

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}