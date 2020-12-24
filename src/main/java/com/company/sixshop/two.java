package main.java.com.company.sixshop;

class two {

    public static int[] solution(int[] grade) {
        int[] answer = new int[grade.length];
        int[] temp = grade;
        int max = 0;
        for (int i = 0; i < grade.length; ++i) {
            if (max < grade[i])
                max = grade[i];
        }

        for (int i = 0; i < temp.length; ++i) {
            if (max == temp[i])
                answer[i] = 1;
            else
                answer[i] = max - temp[i] + 1;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] temp2 = {3, 2, 1, 2};

        int[] temp = solution(temp2);

    }
}
