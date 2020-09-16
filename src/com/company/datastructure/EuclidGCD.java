package com.company.datastructure;
import java.util.Scanner;

public class EuclidGCD {

    // 재귀를 사용하여 정수 x,y 의 최대공약수 반환
    static int gcd(int x, int y){
        if(y == 0) return x;
        else return gcd(y, x%y);
    }

    // 재귀를 사용하지 않고 정수 x,y 의 최대공약수 반환
    static int notUsingRecursive(int x, int y){
        if(y == 0) {
            return x;
        }else {
            int value1 = y;
            int value2 = y ;
            y = x % y;
            while(y!=0){
                value2 = y;
                y = value1 % value2;
                value1 = value2;
            }
            return value2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수의 최대공약수를 구합니다.");
        System.out.print("정수를 입력하세요 : ");    int x = scanner.nextInt();
        System.out.print("정수를 입력하세요 : ");    int y = scanner.nextInt();

        System.out.println("최대공약수는" + gcd(x,y) + "입니다.");
        System.out.println("최대공약수는" + notUsingRecursive(x,y) + "입니다.");
    }
}