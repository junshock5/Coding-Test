package com.company.hakerank.zero;

import java.util.Scanner;

public class Java_Output_Formatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int length = (int) (Math.log10(x) + 1);
            if (x == 0)
                length = 0;
            int slength = s1.length();
            for (int j = slength; j < 15; ++j)
                s1 += " ";
            if (length == 1)
                s1 += "00";
            else if (length == 2)
                s1 += "0";
            else if (length == 0)
                s1 += "00";

            System.out.println(s1 + x);

        }
        System.out.println("================================");

    }
}
