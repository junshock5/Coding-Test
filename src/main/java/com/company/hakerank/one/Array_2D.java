package com.company.hakerank.one;

import java.util.Scanner;


// 3 1 3 모래시계중 가장 큰값 리턴!

// 0.1 0.2 0.3    우로 4개 아래로 4개 16번
// 1.1
// 2.0 2.1 2.2


public class Array_2D {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        int max = -99999;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                //System.out.print(arrItem);
                // 0,0기준으로 더해서 큰값 찾자z


            }
            //System.out.println();
        }

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {
                if (j <= 3 && i <= 3) {
                    int value = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                            arr[i + 1][j + 1] +
                            arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (value >= max)
                        max = value;
                }


            }
            //System.out.println();
        }
        System.out.print(max);


        scanner.close();
    }
}
