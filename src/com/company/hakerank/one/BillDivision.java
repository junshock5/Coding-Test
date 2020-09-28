package com.company.hakerank.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class BillDivision {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < bill.size(); ++i) {
            sum += bill.get(i);
        }

        if ((sum - bill.get(k)) / 2 == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - (sum - bill.get(k)) / 2);

    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] billItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billItems[i]);
            bill.add(billItem);
        }

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
