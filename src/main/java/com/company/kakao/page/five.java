package com.company.kakao.page;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

class five {

    static String LCS = "";
    static Set<String> strings = new HashSet<>();

    private static boolean addSet(String str, int size) {
        Queue<Vector<Integer>> q = new LinkedBlockingQueue<>();
        String temp;
        int index = 0;

        while (index + size <= str.length()) {
            temp = str.substring(index, index + size);

            if (strings.contains(temp)) {
                LCS = temp;
                return false;
            } else {
                strings.add(temp);
            }
            index++;
        }
        return true;
    }

    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // " " split
        // 알파벳이 아닌거를  *인지 ?인지 전부찾는다.
        // ?인경우 맞다고 생각하고
        // *인 경우는 개수와 상관없이 앞뒤로 원래문자를 제거
        // 같다면 true

        for (int i = 1; i <= Integer.parseInt(input); ++i) {
            String[] inputArr = br.readLine().split(" ");

            String input1 = inputArr[0];
            String input2 = inputArr[1];

            int length = (input1.length() < input2.length()) ? input1.length() : input2.length(); // 2가 1보다 크면 1길이를, 작다면 2길이를 대입. 즉, 작은 길이 대입

            while (length > 0) {
                if (!addSet(input1, length) || !addSet(input2, length)) {
                    System.out.println("true");
                    break;
                }
                length--;
            }

        }

    }
}
