package com.company;

import com.company.hakerank.two.BigDecimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int n, row, val;
        n = scanner.nextInt();


        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        //list.add(new Integer[]{12,42,32});
        //list.add(new Integer[]{8,176, null});

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> mChildList = new ArrayList<Integer>();
            row = scanner.nextInt();
            mChildList.add(row);
            for (int j = 1; j <= row; ++j) {
                val = scanner.nextInt();
                mChildList.add(val);
            }
            list.add(mChildList);
        }


        int q;
        q = scanner.nextInt();

        Integer values [][] = new Integer[1000][2];
        for (int i = 0; i < q; ++i) {
            for (int j = 0; j < 2; ++j) {
                int k;
                k = scanner.nextInt();
                values[i][j]=k;
            }
        }


        for (int i = 0; i < list.size(); i++) {

            for (int j = 1; j < list.get(i).size(); ++j) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println("");

//            if(list.get(values[i][0]).get(values[i][1]). != null)
//                System.out.println(list.get(values[i][0]).get(values[i][1]));
//            else
//                System.out.println("ERROR!");

        }


    }
}