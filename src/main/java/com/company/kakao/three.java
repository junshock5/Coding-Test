package com.company.kakao;

import java.util.Scanner;


class Result {

    /*
     * Complete the 'solution' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String solution(long n) {
        // Write your code here
        return null;
    }

}

class Main {
    private static final Scanner scanner = new Scanner(System.in);



    public static String solution(long n) {
        // Write your code here
        double arrayMax = Math.pow(10, 9);
        char[][] array = new char[1][703];
        char[][] array2 = new char[1][703];
        String[][] resultArray = new String[1][704];

        long cnt = 1;
        for (int i = 0, k = 2; i < 1; i++, k += 2) {
            int measure = 0;
            char ch1 = 'A';
            char ch2 = 'A';
            for (int j = 0; j <= 702; j++) {
                if (j % 26 == 0 && j != 0) {
                    measure++;
                    if (measure >= 2) {
                        ch1++;
                        ch2 = 'A';
                    } else
                        ch1 = 'A';
                }
                array[0][j] = ch1;
                array2[0][j] = ch2;

                if (measure >= 1) {
                    if (ch2 < 90)
                        ch2++;
                    resultArray[0][j] = array[0][j] + "" + array2[0][j];
                    //System.out.print(array[i][j] + "" + array2[i][j] + " ");
                    cnt++;
                } else {
                    if (ch1 < 90)
                        ch1++;
                    resultArray[0][j] = array[0][j] + "";
                    //System.out.print(array[i][j] + " ");
                    cnt++;
                }
            }

            System.out.println("");
            if (measure >= 1) {
                ch2 = 'A';
                ch2 += k;
            } else {
                ch1 = 'A';
                ch1 += k;
            }
        }
        long row = (n / 702);
        long col = n - 702 * row - 1;

        if(col==-1) {
            col=701;
            row--;
        }
        // 숫자를 입력하면 행 알파벳
        // 열 숫자 가 나와야한다.

        //System.out.println((row + 1) + "" + resultArray[0][(int) col]);
        return (row + 1) + "" + resultArray[0][(int) col];
    }

    public static void main(String args[]) {
        long n = scanner.nextInt();
        solution(n);
//
//        long cnt = 1;
//        long n = scanner.nextInt();
//        for (int i = 0, k = 2; i < 2; i++, k += 2) {
//            int measure = 0;
//            char ch1 = 'A';
//            char ch2 = 'A';
//            for (int j = 0; j < 702; j++) {
//                if (j % 26 == 0 && j != 0) {
//                    measure++;
//                    if (measure >= 2) {
//                        ch1++;
//                        ch2 = 'A';
//                    } else
//                        ch1 = 'A';
//                }
//                array[i][j] = ch1;
//                array2[i][j] = ch2;
//
//                if (measure >= 1) {
//                    if (ch2 < 90)
//                        ch2++;
//                    resultArray[i][j] = array[i][j] + "" + array2[i][j];
//                    System.out.print(array[i][j] + "" + array2[i][j] + " ");
//                    cnt++;
//                } else {
//                    if (ch1 < 90)
//                        ch1++;
//                    resultArray[i][j] = array[i][j] + "";
//                    System.out.print(array[i][j] + " ");
//                    cnt++;
//                }
//            }
//
//            System.out.println("");
//            if (measure >= 1) {
//                ch2 = 'A';
//                ch2 += k;
//            } else {
//                ch1 = 'A';
//                ch1 += k;
//            }
//        }
//        long row = (n / 702);
//        long col = n - 702 * row - 1;
//
//        //System.out.println(resultArray[row][col]);
//
//        // 숫자를 입력하면 행 알파벳
//        // 열 숫자 가 나와야한다.
//        System.out.println((row + 1) + "" + resultArray[(int) row][(int) col]);


    }
}