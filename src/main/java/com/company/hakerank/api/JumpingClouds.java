package com.company.hakerank.api;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class JumpingClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumpCount=0;
        int threeCount=1;
        // 000이 연속되면 굳이 안뛰어도 된다 1이면 무조건 뛰어야한다. 처음 0은 세지 않는다.
        // 전체 0 세고 000 3연속 된 갯수 제외하기.
        for(int i=1; i<c.length; ++i) {
            if(c[i]==1){
                jumpCount+=1;
                threeCount=0;
            }
            else if(c[i]==0){
                threeCount+=1;
            }
            if(threeCount==3){
                jumpCount+=1;
                threeCount=1;
            }

        }
        System.out.print(c.length-jumpCount-1);
        return c.length-jumpCount-1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}