package com.company.hakerank.one;

import java.util.Arrays;
import java.util.Scanner;

class SubStringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        char[] chArr = s.toCharArray();
        String[] str = new String[chArr.length-k+1];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0,j=k; i<str.length; i++,j++){
            str[i] = s.substring(j-k, j);
        }

        Arrays.sort(str);
        smallest = str[0];
        largest = str[str.length-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}