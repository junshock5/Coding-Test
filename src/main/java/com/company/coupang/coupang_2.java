package com.company.coupang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class coupang_2 {

    public static long[] solution(long n) {
        long[] answer = {};
        // 약수를 구하고 2개의 곱이 같은 것중에서 두개다 소수인지 체크

        // 약수 곱중 자기 자신의 값과 같은지 확인.
        ArrayList<Integer> list = new ArrayList<Integer>();

        int a;
        for (a = 1; a <= n; a++) {
            if ((n % a) == 0) {
                //System.out.println(a);
                list.add(a);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if ( (list.get(i) * list.get(j)) == a) {
                    if (isPrime(list.get(i)) && isPrime(list.get(j))) {
                        answer = addElement(answer, list.get(i));
                        answer = addElement(answer, list.get(j));
                    }
                    else{
                        answer=addElement(answer,-1);
                    }
                        
                }
            }
        }

        return answer;
    }

    static long[] addElement(long[] a, long e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }

    public static boolean isPrime(int num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
                //나누어 떨어지면 더이상 소수가 아니므로 break를 걸어 for문을 끝낸다.
            } else {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        solution(12);
    }

}