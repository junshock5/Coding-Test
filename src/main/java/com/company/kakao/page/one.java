package com.company.kakao.page;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class one {


    public static int fibo(int n) {

        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i = 1; i <= Integer.parseInt(input); ++i) {
            int num = Integer.parseInt(br.readLine());

            for (int k = 0; k < num; ++k) {
                int result = fibo(k + 2);
                if (num == 1) {
                    System.out.println(2);
                    break;
                }
                if (num == 2) {
                    System.out.println(3);
                    break;
                }
                if (num == 3) {
                    System.out.println(5);
                    break;
                }
                if (result > num) {
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}

// 1 1 2 3 5 8 13 21 34