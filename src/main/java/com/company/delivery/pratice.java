package main.java.com.company.delivery;

import java.util.Arrays;

class pratice {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A); //정렬이 되어있고 그다음값이 없다면 바로 return하면된다. 하지만 1부터 체크를해야한다.
        int i = 0;

        if (A[A.length - 1] < 0)
            return 1;

        for (i = 1; i < A[A.length - 1]; ++i) {
            if (Arrays.binarySearch(A, i) < 0)
                return i;
            else
                continue;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] times = {-1, -3, -4, -5};
        System.out.println(solution(times));
    }


}
