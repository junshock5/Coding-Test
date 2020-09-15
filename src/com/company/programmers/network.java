//package com.company;
//import java.util.Scanner;
//
//// 네트워크
//// 3 [1,1,0], [1,1,0], [0,0,1]
//// 3 [1,1,0], [1,1,1], [0,1,1]
//
//public class network {
//
//        static int[][] arr1= new int[200][200];
//        static int[][] arr2= new int[200][200];
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int[][] arr= new int[200][200];
//        int i,j;
////        for(i=0; i<input; i++){
////            for(j=0; j<input; j++){
////                arr[i][j] = sca.nextInt();
////            }
////        }
//
//        String array = sc.next();
//        int answer = solution(input, arr);
//        System.out.println(answer);
//    }
//
//
//    public static int solution(int n, int[][] computers) {
//        int answer = 0;
//        int cnt=0;
//
//        for(int i=0; i<n; ++i)
//        {
//            for(int j=0; j<n; ++j)
//            {
//                if( computers[i][j]==3 || i<=j || computers[i][j]==3 )
//                    continue;
//                if(computers[i][j]==1 && computers[j][i]==1)
//                {
//                    cnt++;
//                    computers[j][i]=3;
//                }
//
//            }
//        }
//        answer= n-cnt;
//        return answer;
//    }
//}
