package main.java.com.company.nexon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class one {
    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> tempa;
        for (int i = 0; i < rotate.size(); ++i) {
            tempa = new ArrayList<>(a);
            Collections.rotate(tempa, (tempa.size() - rotate.get(i)) % tempa.size());
            int maxVal = Collections.max(tempa);
            int maxIdx = tempa.indexOf(maxVal);
            answer.add(maxIdx);
        }
        return answer;
    }


    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        List<Integer> rotate = new ArrayList<>();

        //a.add(4);
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(3);
        a.add(5);

        //rotate.add(2);
        rotate.add(6);
        rotate.add(9);
        rotate.add(12);


        List<Integer> temp = getMaxElementIndexes(a, rotate);
    }
}

// 1 2 4 3

// 1 3


// 2 4 3 1  -> 1
// 3 1 2 4  3

// 6 9 12


// 1 2 4 3 5
// 12

