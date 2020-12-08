package main.java.com.company.aceproject;

import java.util.ArrayList;
import java.util.Collections;

class two {

    public static ArrayList<String> results = new ArrayList<String>();

    static String solution(String s) {
        String result = null;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; ++i) {
            combination(s, i + 1);
        }

        Collections.sort(results);
        result = results.get(results.size() - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("baba"));
    }

    public static void combination(String arr, int destNum) {
        char[] temp = new char[destNum];
        combination(arr, 0, destNum, temp);
    }

    public static void combination(String arr, int curLoc, int destNum, char[] temp) {
        if (0 == destNum) {
            String temp2 = "";
            for (int i = 0; i < temp.length; i++) {
                temp2 = temp2.concat(String.valueOf(arr.charAt(temp[i])));
            }
            results.add(temp2);
            return;
        }

        for (int i = curLoc; i < arr.length(); i++) {
            temp[temp.length - destNum] = (char) i;
            combination(arr, i + 1, destNum - 1, temp);
        }
    }
}
