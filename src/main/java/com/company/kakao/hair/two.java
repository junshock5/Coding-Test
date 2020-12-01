package com.company.kakao.hair;

import java.util.Scanner;

class two {

    public static int solution(int[][] office, int kk) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i <= office.length - kk; ++i) {
            for (int j = 0; j <= office.length - kk; ++j) {
                int sum = 0;
                for (int k = 0; k < kk; ++k) {
                    for (int l = 0; l < kk; ++l) {
                        sum += office[i + k][j + l];
                    }
                }
                if (max < sum)
                    max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        int arr[][] = new int[5][5];
        int a, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("2차원 배열안의 값을 순차적으로 입력하세요");
        // arr의 전체길이
        for (i = 0; i < arr.length; i++) {
            // arr[i]의 전체
            for (j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] : ");
                a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        int b = sc.nextInt();

        int result = solution(arr, b);
        System.out.println(result);

//        for (i = 0; i < 3; i++) {
//            for (j = 0; j < 3; j++) {
//                System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
//            }
//        }
    }
}
