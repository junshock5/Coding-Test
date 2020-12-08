package main.java.com.company.aceproject;

class three {
    public static int solution(int n, int maxhp, int[] times, int[] effects) {
        int answer = 0;
        int currentHp = 0;
        int maxCount = 0;
        int zeroCount = 0;
        for (int i = 0; i <= times[times.length - 1]; ++i) {
            for (int j = 0; j < times.length; ++j) {
                if (times[j] < i) {
                    currentHp += effects[j];
                }
            }
            if (currentHp > maxhp)
                currentHp = maxhp;
            if (currentHp < 0)
                currentHp = 0;
            if (currentHp == maxhp)
                maxCount++;
            if (currentHp == 0)
                zeroCount++;

        }
        answer = maxCount + zeroCount;
        return answer;
    }

    public static void main(String[] args) {
        int[] times = {1, 5, 7, 10, 11};
        int[] effects = {4, -6, -1, 4, 1};
        System.out.println(solution(5, 10, times, effects));
    }


}
