package com.company.hakerank.two;
import java.util.Scanner;
import java.util.Stack;

public class Stack_push_pop_peek {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);


        //String[] values = {"(", ")", "{", "}", "[", "]"};
        //int[] intValues = {1, -1};

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            Stack<Integer> stacky = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stacky.isEmpty()) {
                    switch(input.charAt(i)) {
                        //읽기 - peek 스택에서 top이 가리키는 데이터를 읽는 작업을 peek이라고 하며 top 값의 변화는 없다.
                        case '}' : if (stacky.peek() == '{') {
                            stacky.pop();
                        } break;
                        case ']' : if (stacky.peek() == '[') {
                            stacky.pop();
                        } break;
                        case ')' : if (stacky.peek() == '(') {
                            stacky.pop();
                        } break;
                        default: stacky.push((int) input.charAt(i));
                    }
                } else {
                    stacky.push((int) input.charAt(i));
                }
            }
            System.out.println(stacky.isEmpty());

//            int result=0;
//            for(int i=0; i<input.length(); ++i)
//            {
//               boolean contains = Arrays.stream(values).anyMatch(Character.toString(input.charAt(i))::equals);
//               if(contains)
//                   System.out.println("true");
//               else
//                   System.out.println("false");
//
//
//            }
        }

    }
}