package main.java.com.company.programmers.skillcheck;

class two {
    public static int solution(int n) {
        if(n == 1 || n == 2) return 1; // @1

        int n1 = 1, n2 = 1, sum = 0; // @2
        for(int i=3; i<=n; i++) { // @3
            sum = n1 + n2;
            sum %= 1234567;
            n1 = n2;
            n2 = sum;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(solution(3));
    }


}
