package com.company.hakerank.api;

import java.io.*;
import java.util.Scanner;


class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int n, String s) {
        // Write your code here
        int level = 0;
        int valley = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                level++;
            } else {
                level--;
            }
            //Valley가 되는 기준은 마지막U로 sea level까지 올라와야 완성되니까
            if (s.charAt(i) == 'U' && level == 0) {
                valley++;
            }
        }
        return valley;
    }


}

class Main {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        for (int i = 0; i < ar.length - 1; ++i) {
            for (int j = 1; j < ar.length; ++j) {
                if (ar[i] == ar[j] && i != j) {
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("sample.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}