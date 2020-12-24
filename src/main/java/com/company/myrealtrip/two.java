package main.java.com.company.myrealtrip;

import java.util.Arrays;


class two {
    public static String solution(String diet, String breakfast, String lunch) {
        String answer = "";

        if (diet.equals("") && breakfast.equals("") && lunch.equals(""))
            return answer;

        if (breakfast.equals("") && lunch.equals("")) {
            String[] temp = diet.split("");
            Arrays.sort(temp);

            String change = "";
            for (int i = 0; i < temp.length; i++) {
                change += temp[i];
            }
            return change;
        }

        if (diet.contains(breakfast)) {
            diet = diet.replaceAll(breakfast, "");
        } else
            answer = "CHEATER";

        if (diet.contains(lunch)) {
            diet = diet.replaceAll(lunch, "");
            answer = diet;
        } else
            answer = "CHEATER";

        return answer;
    }

    public static void main(String[] args) {


        String temp = solution("EDSMB", "MSD", "");

    }
}
