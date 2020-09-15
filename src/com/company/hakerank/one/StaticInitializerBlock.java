package com.company.hakerank.one;

import java.util.Scanner;


public class StaticInitializerBlock {


    static boolean flag = false;
    static int B;
    static int H;
    static final Scanner scanner = new Scanner(System.in);

    static {

        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B <= 0 || H <= 0)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
            System.out.println(B * H);
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

