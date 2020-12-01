package com.company.datastructure;
import java.util.Scanner;

public class Greedy_Money {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 1000 - scanner.nextInt();
        int[] array = {500, 100, 50, 10, 5, 1};
        int idx = 0;
        int ans = 0;
        while (money != 0) {
            int change = money / array[idx];
            money -= change * array[idx++];
            ans += change;
        }
        System.out.println(ans);
    }
}
