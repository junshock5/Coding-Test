package main.java.com.company.apology;

//https://www.neya.kr/120
class one {
    public static String solution(String[] strs) {
        if (strs.length == 0) return "";

        StringBuilder result = new StringBuilder();
        boolean same = true;

        for (int i = 0; i < strs[0].length(); i++) {
            char temp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i) {
                    same = false;
                    break;
                } else if (temp == strs[j].charAt(i)) {
                    continue;
                }
                same = false;
                break;
            }

            if (same) result.append(temp);
            else break;
        }
        return result.toString();
    }

    public static void main(String[] args) {

        //System.out.println(solution("a", "b"));
    }


}


// 4번 쿼리 문제 답

//    SELECT MONTH(CREATED_AT) AS '월' ,COUNT(*) AS '결제 건수' ,SUM(AMOUNT) AS'사용 금액'
//        FROM CARD_USAGES
//        WHERE CREATED_AT>='2018-06-00 00:00:00' AND  CREATED_AT<'2019-01-00 00:00:00'  AND CATEGORY =0
//        GROUP BY MONTH(CREATED_AT)