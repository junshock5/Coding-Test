package main.java.com.company.sixshop;

class twoReal {


    public static int[] solution(int[] grade) {
        int[] answer = new int[grade.length];
        int[] temp = grade;
        int max = 0;
        for (int i = 0; i < grade.length; ++i) {
            if (max < grade[i])
                max = grade[i];
        }

        int plus = 0;

        for (int i = 0; i < temp.length; ++i) {
            if (max == temp[i])
                answer[i] = 1;
            else
                answer[i] = max - temp[i] + 1 + plus;
        }

        // 여기서 중복 값이 있다면 그 이후 등수를 + 해야한다.

        return answer;
    }

    public static void main(String[] args) {

        int[] temp2 = {3, 2, 1, 2};

        int[] temp = solution(temp2);

        int[] grade = {40, 50, 50, 60, 99, 45};
        int[] rank = {1, 1, 1, 1, 1, 1}; // rank 구하기
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade.length; j++) {
                if (grade[i] < grade[j]) {
                    rank[i]++;
                }
            }
        } // 시간 복잡도 : O(n^2), n : grade.length //
        // 출력
        for (int i = 0; i < grade.length; i++) {
            System.out.println(rank[i] + "등 : " + grade[i]);
        }
    }
}
