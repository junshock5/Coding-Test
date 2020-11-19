package com.company.hakerank.api;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class SalesByMatch {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        for (int i = 0; i < ar.length - 1; ++i) {
            for (int j = 1; j < ar.length; ++j) {
                if (ar[i] == ar[j] && i!=j) {
                    if (ar[i] != 0 && ar[j] != 0) {
                        result += 1;
                        ar[i] = 0;
                        ar[j] = 0;
                    }
                }
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}