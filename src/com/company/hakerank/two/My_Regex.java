package com.company.hakerank.two;

import java.util.Scanner;

//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
//Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
// 256.256.256.256 오키

public class My_Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }


    }

}

// https://farenda.com/java/java-regex-matching-ip-address/
class MyRegex {
    // IP 주소 유효성 검사에서 중요한 부분 은 0에서 255 사이의 숫자를 일치시키는 것입니다 .
    public static String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    public static final String pattern
            = zeroTo255 + "\\." + zeroTo255 + "\\."
            + zeroTo255 + "\\." + zeroTo255;
}