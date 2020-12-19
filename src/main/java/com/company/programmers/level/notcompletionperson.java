package main.java.com.company.programmers.level;

import java.util.Arrays;

class notcompletionperson {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int index = 0;
        for (int i = 0; i < completion.length; ++i) {
            if (!completion[i].equals(participant[i])) {
                index = i;
                break;
            } else
                index = i + 1;
        }
        String answer = participant[index];
        return answer;
    }

    public static void main(String[] args) {
        String[] s_array = {"leo", "kiki", "eden"};
        String[] s_array2 = {"eden", "kiki"};
        System.out.println(solution(s_array, s_array2));
    }


}
