package main.java.com.company.delivery;

class one {

    public static int solution(int N) {
        // 동일한 자릿수의 가장 작은수를 반환 125이면 100.
        if(N==1)
            return 0;
        int length = (int)(Math.log10(N)+1);

        int result = 1;

        for(int i=1; i<length; ++i)
            result *=10;

        return result;
    }

    public static void main(String[] args) {

        System.out.println(solution(125));
    }


}
