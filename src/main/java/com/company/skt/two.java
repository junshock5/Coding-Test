package main.java.com.company.skt;

class two {

    public static int solution(int[] A, int K) {
        // write your code in Java SE 8
        int minResult = 100001;
        // K개씩 뺀 값을 리스트에 저장 후
        // 가장 작은 적은 값을 검사 후 리턴
        for (int i = 0; i < A.length - K + 1; ++i) {
            int tempSum = 0;
            if (K - i >= 0) {
                for (int j = K - i; j < A.length - i - 1; ++j) {
                    tempSum = Math.abs(A[j] - A[j + 1]);
                    if (tempSum < minResult)
                        minResult = tempSum;
                }
            }
        }

        return minResult;
    }

    public static void main(String[] args) {
        int[] arr = {8,8,4,3};
        System.out.println(solution(arr, 2));
    }
}
