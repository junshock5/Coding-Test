package com.company.hakerank.api;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class repeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long numOfChar = 0 ;
        int numOfA = 0;
        int stringLength = s.length();

        if(stringLength > 0){
            for(int i=0;i<stringLength;i++){
                if(s.charAt(i)=='a'){
                    numOfA++;
                }
            }

            long division = n / stringLength;
            long mod = n % stringLength;
            numOfChar = division * numOfA;

            for(int i=0;i<mod;i++){
                if(s.charAt(i)=='a'){
                    numOfChar++;
                }
            }
        }
        return numOfChar;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}