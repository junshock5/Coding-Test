package com.company.datastructure;
import java.util.Scanner;

public class Hanoi {

    // 재귀함수
    static void move(int no, int x, int y){

        if(no > 1){
            move(no-1, x, 6-x-y);
        }

        String stringX = "";
        String stringY = "";
        if(x==1) stringX = "A";
        if(y==1) stringY = "A";
        if(x==2) stringX = "B";
        if(y==2) stringY = "B";
        if(x==3) stringX = "C";
        if(y==3) stringY = "C";

        System.out.println("원반[" + no + "]을" + stringX + "기둥에서 " + stringY + "기둥으로 옮김");
        if(no > 1){
            move(no-1, 6- x-y, y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("하노이의 탑");
        System.out.println("원반 개수 : ");
        int n = scanner.nextInt();
        move(n, 1, 3);    // 1번 기둥의 n개의 원반을 3번 기둥으로 옮김
    }
}
