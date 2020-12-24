package main.java.com.company.myreal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class one {


    public static String[] solution(String[] sequence){
        List<String> list = Arrays.asList(sequence);
        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        return sequence;
    }
    public static void main(String[] args) {

        String[] temp2 = {"1","3","2","4"};

        String[] temp = solution(temp2);

    }
}
