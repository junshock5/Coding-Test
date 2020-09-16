package com.company.hakerank.one;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();


        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < count; ++i) {
            int value = scanner.nextInt();
            arrayList.add(value);
        }

        int questionCount = scanner.nextInt();

        for (int i = 0; i < questionCount; ++i) {
            String string = scanner.next();

            if (string.equals("Insert")) {
                int val1, val2;
                val1 = scanner.nextInt();
                val2 = scanner.nextInt();

                arrayList.add(val1, val2);
            }
            if (string.equals("Delete")) {
                int val1;
                val1 = scanner.nextInt();

                arrayList.remove(val1);
            }
        }

        for (int i = 0; i < arrayList.size(); ++i) {
            System.out.print(arrayList.get(i) + " ");
        }

    }
}
