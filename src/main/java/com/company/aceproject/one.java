package main.java.com.company.aceproject;

import java.util.ArrayList;
import java.util.List;

class one {
    public static int solution(int n, int[] v) {
        // 배열을 2뭉터기로 나눴을때 각 뭉터기의 합들간의 차가 최소값
        // 단, 왼쪽 배열 개수가 최소여야 하므로 [1,2,1,2,1] 일때는 [1,2] [1,2,1] 이된다. 이경우 왼쪽 배열의 개수를 return ;
        long minResult = Long.MAX_VALUE;
        int leftCount = 0;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        long leftSum = 0L;
        long rightSum = 0L;
        long tempSum = 0L;

        for (int i = 0; i < v.length; ++i) {
            left.clear();
            right.clear();
            for (int j = 0; j < i; ++j) {
                left.add(v[j]);
            }
            for (int k = i; k < v.length; ++k) {
                right.add(v[k]);
            }

            leftSum = left.stream()
                    .mapToLong(Integer::longValue)
                    .sum();
            rightSum = right.stream()
                    .mapToLong(Integer::longValue)
                    .sum();
            tempSum = Math.abs(leftSum - rightSum);

            if (tempSum == 0) {
                leftCount = left.size();
                return leftCount;
            }

            if (minResult > tempSum) {
                leftCount = left.size();
                minResult = tempSum;
            }
        }
        return leftCount;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, -1, -2, -3};
        System.out.println(solution(7, arr));
    }
}
