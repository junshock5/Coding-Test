package com.company.kakao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class two_2 {
    public static void main(String[] args) throws IOException {

        //Collection<Integer> list = new ArrayList<CustomObject>();

        //Collections.sort(list, comparing(CustomObject::getId));

        List<Integer> arr = new ArrayList<>();
        //arr.add(6);
        arr.add(2);
        arr.add(3);
        arr.add(10);
        arr.add(2);
        arr.add(4);
        arr.add(8);
        arr.add(1);

//        arr.add(10);
//        arr.add(8);
//        arr.add(7);
//        arr.add(6);
//        arr.add(5);

        int max = -1;
        int[] iArray = new int[200001]; //초기값 0
        for (int i = 0; i < arr.size() - 1; ++i) {
            if (arr.get(i + 1) - arr.get(i) > 0)
                iArray[i] = 1;
        }


        for (int i = 0; i < iArray.length; ++i) {
            if (iArray[i] == 1) {
                if (max < arr.get(i + 1) - arr.get(i))
                    max = arr.get(i + 1) - arr.get(i);
            }
        }
        //return max;
        System.out.println(max);

    }
}