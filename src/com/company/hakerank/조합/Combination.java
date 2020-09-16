package com.company.hakerank.조합;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 참고: https://codevang.tistory.com/298

public class Combination {

    /**
     * 조합 구하기
     *
     * @param arr    : 기준 리스트
     * @param result : 결과를 담아줄 리스트
     * @param index  : 반복문 시작 인덱스
     * @param n      : 전체 갯수
     * @param r      : 뽑을 갯수
     */
    private static void reculsion(List<Integer> arr, List<Integer> result, int index, int n, int r) {

        if (r == 0) {
            int result_Sum=0;
            for(int i=0; i<result.size();++i)
            {
                result_Sum+=result.get(i);
            }
            //System.out.println(result_Sum);
            if(result_Sum<0)
                cnt++;
            System.out.println(result.toString()+"  "+result_Sum);
            return;
        }

        for (int i = index; i < n; i++) {

            result.add(arr.get(i));
            reculsion(arr, result, i + 1, n, r - 1);
            result.remove(result.size() - 1);
        }
    }

    static final Scanner scanner = new Scanner(System.in);
    static int cnt=0;

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; ++i)
        {
           int num = scanner.nextInt();
            arr.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=n; ++i)
        reculsion(arr, result, 0, arr.size(), i);

        System.out.print(cnt);
    }

}