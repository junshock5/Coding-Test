package main.java.com.company.apology;

class three {
    public static int solution(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            for (int j = i + 1; j < prices.length; ++j) {
                if (max < prices[j] - prices[i])
                    max = prices[j] - prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] abc = {3, 2, 4, 8, 7};
        //System.out.println(solution("a", "b"));
        System.out.println(solution(abc));

    }


}
