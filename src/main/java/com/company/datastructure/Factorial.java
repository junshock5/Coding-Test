package com.company.datastructure;
import java.util.Scanner;

public class Factorial {

    // 팩토리얼을 재귀적으로 구현
    // 재귀 메서드를 사용하여 양의 정수 n의 팩토리얼을 반환한다.
    static int factorial(int n){
        if(n>0) return n * factorial(n-1);
        else return 1;
    }

    // 자기 자신을 부르지 않고 구현한 메서드
    static int notUsingRecursive(int n){
        if(n>0){
            int value = 1;
            for(int i=n; i>0; i--){
                value = value * i;
            }
            return value;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int x = scanner.nextInt();
        System.out.println(x+ "의 팩토리얼은 " + factorial(x) + "입니다.");
        System.out.println(x+ "의 재귀메서드 사용안한 메서드는 " + notUsingRecursive(x) + "입니다.");
    }
}