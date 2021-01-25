package main.java.com.company.programmers.ect;

import java.util.Set;
import java.util.TreeSet;

// 1,1,2,3,4 -> 1+1 1+2

class PickTwoAndAdd {
    public static Integer[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().toArray(Integer[]::new);
    }

    public static void main(String args[]) throws Exception {
        int[] answer = {2, 1, 3, 4, 1};

        Integer[] a = solution(answer);

    }
}
