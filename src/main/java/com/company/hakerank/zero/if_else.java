package com.company.hakerank.zero;

import java.util.Scanner;

public class if_else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 1)
            System.out.printf("Weird");
        else if (N > 2 && N < 5)
            System.out.printf("Not Weird");
        else if (N > 6 && N <= 20)
            System.out.printf("Weird");
        else if (N > 20)
            System.out.printf("Not Weird");

        scanner.close();
    }
}
