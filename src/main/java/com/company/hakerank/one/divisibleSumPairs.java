package com.company.hakerank.one;

import java.io.IOException;
import java.util.Scanner;


class divisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int cnt = 0;
        for (int i = 0; i < ar.length - 1; ++i) {
            for (int j = i + 1; j < ar.length; ++j) {
                if ((ar[i] + ar[j]) % k == 0)
                    cnt++;
            }
        }
        System.out.println(cnt);
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
