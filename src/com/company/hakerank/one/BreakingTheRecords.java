package com.company.hakerank.one;

import java.io.IOException;
import java.util.Scanner;


class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {


        int max = -1;
        int min = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;

        for (int i = 0; i < scores.length; ++i) {
            if (max < scores[i]) {
                max = scores[i];
                maxIndex++;
            }
            if (min > scores[i]) {
                min = scores[i];
                minIndex++;
            }
        }
        int[] i_array = {maxIndex, minIndex};
        System.out.println(maxIndex + " " + minIndex);

        return i_array;
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
