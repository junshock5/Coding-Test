package main.java.com.company.skt;

class one {

    public static String solution(int[] T) {
        // write your code in Java SE 8
        int maxResult = 0;
        int maxIndex=0;
        int interval = T.length / 4;
        String result = null;

        for(int j=0; j<4; ++j){
            int tempSum=0;
            for (int i = 0 + j*interval; i < interval + j*interval -1; ++i) {
                tempSum += Math.abs(T[i] - T[i + 1]);
            }
            if(maxResult<tempSum){
                maxResult=tempSum;
                maxIndex = j;
            }

        }
        if(maxIndex==0)
            result="WINTER";
        else if(maxIndex==1)
            result="SPRING";
        else if(maxIndex==2)
            result="SUMMER";
        else if(maxIndex==3)
            result="AUTUMN";

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -14, -5, 7, 8, 42, 8, 3};
        System.out.println(solution(arr));

    }
}
