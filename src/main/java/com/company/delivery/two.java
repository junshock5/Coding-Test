package main.java.com.company.delivery;

class two {

    public static int solution(int N, int K) { //K 올인 횟수, N은 총 배틀 칩 갯수
        // write your code in Java SE 8
        int result = -1;
        int firstN = N;

        // 18 , 2일떄 6값을 나오게하려면
        // firstChip은 홀수이므로 +1
        // firstChip 은 짝수이므로
        // 18짝수이깐 9, 8 4 3 2 1

        for (int i = 0; i < firstN; ++i) {
            if (N == 0)
                break;
            if (N % 2 == 0 && K > 0) {
                K--;
                N = N / 2;
            } else {
                N = N - 1;
            }
            result++;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(solution(18, 2));
    }


}
