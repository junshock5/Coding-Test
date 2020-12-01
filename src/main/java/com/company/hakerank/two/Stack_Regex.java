package com.company.hakerank.two;

import java.util.Scanner;

public class Stack_Regex {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

//        Stack<Integer> stack = new Stack<>();
//        String[] values = {"(", ")", "{", "}", "[", "]"};
//        int[] intValues = {1, -1};


        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
//            int result=0;
//            for(int i=0; i<input.length(); ++i)
//            {
//               boolean contains = Arrays.stream(values).anyMatch(Character.toString(input.charAt(i))::equals);
//               if(contains)
//                   System.out.println("true");
//               else
//                   System.out.println("false");
//            }
            String pattern = "\\(\\)|\\[\\]|\\{\\}";
            while (input.length() != 0) {
                input = input.replaceAll(pattern, "");
                if (input.length() == input.replaceAll(pattern, "").length()) {
                    break;
                }
            }
            System.out.println(input.isEmpty());


        }

    }
}