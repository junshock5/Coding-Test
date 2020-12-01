//package com.company;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//// 2 x n 타일링
//// n resuelt
//// 4 5    4개 타일일 때 배치 방법
//
////1 일떄는 1개
////2일떄는 2개
////3일떄는 3개
////4일떄는 5개
////5일때는 7개
////6일때는 8개
////1 1
////2 1+1
////3 1+2=3
////4 2+3=5
////5 3+5=8
////6 13
//public class tile_2xn {
//    static ArrayList<Integer> list = new ArrayList<Integer>();
//    public static void main(String[] args) {
//        list.add(1);
//        list.add(1);
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int answer = tile(input);
//
//        System.out.println(answer);
//    }
//
//
//    public static int tile(int n)
//    {
//        int result=0;
//        if(n==1)
//            return 1;
//        else if(n==2)
//            return 2;
//        else
//        {
//            for(int i=2; i<n; ++i)
//            {
//                list.add(list.get(i-1)+ list.get(i-2));
//            }
//        }
//        result = list.get(n-1)+ list.get(n-2);
//
//
//        return result;
//    }
//}
