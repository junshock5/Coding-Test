package com.company.hakerank.two;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Comparator2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker<T> implements Comparator<T> {

    public int compare(T o1, T o2) {
        int p1 = ((Player) o1).score;
        int p2 = ((Player) o2).score;
        if(p1 == p2){ //학점이 같으면
            return((Player) o1).name.compareTo(((Player) o2).name);
        }
        return Integer.compare(p2, p1);// 내림차순
    }
}
