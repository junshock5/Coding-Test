package main.java.com.company.sixshop;

class one {
    public static String solution(String s1, String s2) {
        String answer = "";

        int index1 = 0;
        int index2 = 0;

        boolean isTrue1 = true;
        boolean isTrue2 = true;

        for (int i = 0; i < s1.length(); ++i) {
            if (s2.length() - 1 > i) {
                if (s1.charAt(0) == s2.charAt(s2.length() - i - 1) && isTrue1 == true) {
                    index1 = i;
                }
            }
            if (s2.length() - index1 - 1 + i < s2.length() - 1)
                if (s1.charAt(i) == s2.charAt(s2.length() - index1 - 1 + i))
                    isTrue1 = true;
                else
                    isTrue1 = false;

        }
        for (int i = 0; i < s2.length(); ++i) {
            if (s1.length() - 1 > i) {
                if (s2.charAt(0) == s1.charAt(s1.length() - i - 1) && isTrue2 == true) {
                    index2 = i;
                }
            }
            if (s1.length() - index2 - 1 + i < s1.length() - 1)
                if (s2.charAt(i) == s1.charAt(s1.length() - index2 - 1 + i))
                    isTrue2 = true;
                else
                    isTrue2 = false;
        }

        if (index1 > index2)
            answer = s2 + s1.substring(index1 + 1, s1.length());
        else
            answer = s1 + s2.substring(index2 + 1, s2.length());


        return answer;
    }

    public static void main(String[] args) {

        String temp = solution("AxA", "AyA");

    }
}
