package com.company.kakao.mobility;

import java.util.ArrayList;
import java.util.Collections;

class KNum {
    public static int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arr = new ArrayList();
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[i] = arr.get(commands[i][2]-1);
            arr.clear();
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {

    }
}
