package com.company.hakerank.one;

import java.util.Scanner;

class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    public long power(long a, long b) throws Exception {
        if (a == 0 && b == 0)
            throw new Exception("n and p should not be zero.");
        if (a < 0 || b < 0)
            throw new Exception("n or p should not be negative.");
        return (long) Math.pow(a, b);
    }

}

public class Exception_Handling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}