package com.company.hakerank.one;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        //java 8의 경우
        java.util.Map<String, Integer> productPrice = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            Integer phone = in.nextInt();
            in.nextLine();
            // add value
            productPrice.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            //get value
            Integer egg = productPrice.get(s);
            if (egg != null) {
                System.out.println(s + "=" + egg);
            } else {
                System.out.println("Not found");
            }

        }
    }
}

