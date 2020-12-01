package com.company.datastructure;
import java.util.Scanner;

public class String_Compression_N {

    public static int compoundString(String s) {
        int minLen = s.length();
        // unit 단위만큼 검사
        for(int unit = 1 ; unit <= s.length()/2 ; unit++) {
            // 검사할 문자의 범위 start ~ end
            int start = 0;
            int end = start + unit;
            int compressedLen = 0;
            int repeatedCnt = 1;

            // unit만큼 자른 첫 문자열
            String curWord = s.substring(start, end);
            String nextWord;

            start += unit;
            end += unit;

            // 문자열 끝까지 검사
            while(end <= s.length()) {
                nextWord = s.substring(start ,end);

                // next가 cur와 달라지게 될때, cur의 압축 길이를 compressedLen에 더한다.
                if(!curWord.equals(nextWord)) {

                    // 반복이 1 넘으면, 압축 수를 길이에 고려
                    if(repeatedCnt > 1) {
                        compressedLen +=  (int)(Math.log10(repeatedCnt)+1);
                    }
                    compressedLen += curWord.length();

                    repeatedCnt = 0;
                    curWord = nextWord;
                }

                repeatedCnt++;
                start += unit;
                end += unit;
            }

            // while문을 빠져나가며 고려되지 않은 남은 압축 길이 추가
            end -= unit;
            compressedLen += s.substring(end).length();

            // while문을 빠져나가며 고려되지 않은 마지막 압축 문자열 길이 추가
            if(repeatedCnt > 1) {
                compressedLen += (int)(Math.log10(repeatedCnt)+1);
            }
            compressedLen += curWord.length();

            if (  minLen > compressedLen) {
                minLen = compressedLen;
            }
        }

        return minLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        System.out.println(compoundString(string));

    }
}
