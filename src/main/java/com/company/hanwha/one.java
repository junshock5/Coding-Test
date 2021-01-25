package main.java.com.company.hanwha;

class one {
    public static int solution(String s) {
        int answer = 0;

        int count = 1;

        boolean zero = true;

        for (int i = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == '1') {
                count++;
                zero=false;
            } else
                count = 1;

            if (answer < count)
                answer = count;
        }

        if (zero==true)
            answer =0;


        return answer;
    }

    public static void main(String args[]) throws Exception {

        int a = solution("00000");

    }
}
