package com.company.kakao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class two_final {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
//        //arr.add(6);
//        arr.add(2);
//        arr.add(3);
//        arr.add(10);
//        arr.add(2);
//        arr.add(4);
//        arr.add(8);
//        arr.add(1);

//        arr.add(5);
//        arr.add(3);
//        arr.add(6);
//        arr.add(7);
//        arr.add(4);

        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(7);
        arr.add(4);
        arr.add(34);
        arr.add(14);
        arr.add(54);

        int valueMax = 0;
        int valueMin = 200001;
        int max = -1;
        int[] iArray = new int[200001]; //초기값 0
        for (int i = 0; i < arr.size() - 1; ++i) {
            if (valueMin > arr.get(i))
                valueMin = arr.get(i);

            if (arr.get(i + 1) - arr.get(i) > 0) {
                iArray[i] = arr.get(i + 1) - arr.get(i);

                if (valueMax < arr.get(i+1))
                    valueMax = arr.get(i+1);

            }
        }
        System.out.println(valueMax-valueMin);

    }
}