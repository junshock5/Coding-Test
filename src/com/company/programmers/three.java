package com.company.programmers;

import java.text.ParseException;


class three {
    public static int solution(int n, int[][] groups) {
        int answer = 0;


        int[] arr = new int[n];

        for (int i = 0; i < groups.length; ++i) {
            int s = groups[i][0];
            int e = groups[i][1];

            for(int j=s-1; j<e; ++j)
            {
                if(arr[j]==0)
                    arr[j]=1;
            }
        }

        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i]==0)
                answer+=1;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) throws ParseException {
        int[][] temp = {{6, 7}, {1, 4}, {2, 4}};

        solution(7,temp);
    }

}