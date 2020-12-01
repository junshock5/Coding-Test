package com.company.timon;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

class timon_1 {
    /*
    참고: https://codingdojang.com/scode/527?langby=java
    두 문자열에서 짧은 쪽의 길이를 저장합니다.
    이 길이로 각 문자열을 잘라서 Set에 넣습니다.
    Set에 넣을 때 충돌되면 공통 문자열이라 볼 수 있죠.
    DFS로 찾게 됩니다.
    penpineapple, applepen -> aaple
    */
    static String LCS = "";
    static Set<String> strings = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();

        int length = (input1.length() < input2.length()) ? input1.length() : input2.length(); // 2가 1보다 크면 1길이를, 작다면 2길이를 대입. 즉, 작은 길이 대입

        while (length > 0) {
            if (!addSet(input1, length) || !addSet(input2, length)) {
                break;
            }
            length--;
        }

        System.out.print(LCS);
    }

    /*
    참고: https://sungjk.github.io/2016/11/02/Queue.html
    LinkedBlockingQueue는 생성자의 인자에 큐의 용량 capacity 를 명시하여 사이즈를 지정할 수 있는 반면에,
    ConcurrentLinkedQueue는 큐의 사이즈를 지정할 수 없을 뿐만 아니라
    size 메서드는 상수 시간에 호출되지 않아서 큐에 들어있는 원소의 개수를 파악하는 것이 어렵다.
    */
    private static boolean addSet(String str, int size) {
        Queue<Vector<Integer>> q = new LinkedBlockingQueue<>();
        String temp;
        int index = 0;

        while (index + size <= str.length()) {
            temp = str.substring(index, index + size);

            if (strings.contains(temp)) {
                LCS = temp;
                return false;
            } else {
                strings.add(temp);
            }
            index++;
        }
        return true;
    }
}
