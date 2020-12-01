package com.company.kakao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class two {
    public static void main(String[] args) throws IOException {

        //Collection<Integer> list = new ArrayList<CustomObject>();

        //Collections.sort(list, comparing(CustomObject::getId));

        int max = 0;
        List<Integer> arr = new ArrayList<>();
//        arr.add(6);
//        arr.add(7);
//        arr.add(9);
//        arr.add(5);
//        arr.add(6);
//        arr.add(3);
//        arr.add(2);

        arr.add(10);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);


        //Collections.sort(list1);

        for (int i = 0; i < arr.size() - 1; ++i) {
            boolean isTrue = false;
            for (int j = i + 1; j > 0; --j) {
                if (isTrue==false && arr.get(i) < arr.get(j))
                    isTrue = true;
                if (isTrue==true && max < arr.get(i + 1) - arr.get(j - 1))
                    max = arr.get(i + 1) - arr.get(j - 1);
            }
        }
        if(max==0)


//        for (Integer a : list) {
//            System.out.println(a);
//        }
//        System.out.println(list.get(list.size() - 1) - list.get(0));
        System.out.println(max);

    }
}