package com.company.hakerank.two;

import java.util.*;

public class Dequeue {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            //arrayList.add(num);

            deque.add(num);
            set.add(num);

            if (deque.size() == m + 1) {

                int q_out = (int) deque.remove();

                if (!deque.contains(q_out)) {
                    set.remove(q_out);
                }
            }
            max = Math.max(set.size(), max);

        }
        System.out.println(max);

        // 팁은 arraylist에 모두 담아서 이중포문으로 접근하는게 아닌
        // deque에 앞뒤로 담을때마다 max값을 확인한다.

//        int max = 0;
//        Set<Integer> uniqueNumbers = new HashSet<Integer>();
//        for (int i = 0; i < n - m + 1; i++) {
//
//
//            for (int j = i; j < m + i; j++) {
//                uniqueNumbers.add(arrayList.get(j));
//
//            }
//            if (max < uniqueNumbers.size())
//                max = uniqueNumbers.size();
//            uniqueNumbers.clear();
//        }
//        System.out.println(max);

    }
}



