package com.company.hakerank.one;

import java.util.Scanner;

public class Loops2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = 0;
            result += a;
            for (int j = 0; j < n; ++j) {
                //j가 1234 가아니라 0 1 2 4 8 로 변경
                double k = Math.pow(2, j);
                result += k * b;
                System.out.print(result);
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}

