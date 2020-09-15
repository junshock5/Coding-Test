package com.company.hakerank.two;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// java split을 이용해서 <>같은게 있다면 안엑것만 골라내서 prit하게 변경
// <> 안에 <>있어도 유효하나 다른게있으면 출력하지 않는다.
// 태그 안에 내용이 같은지도 확인해야한다.
// <h1><h2> <h1><h2>인지 <h1><h2> <h2> <h1> 인지 왼쪽 태그는 무효!
// 우선 <o><o>별로 나누고 순서별로 안에같은지 판단!

public class Tag_Contractor {

    // < (. + ) >  : HTML 시작 택와 일치합니다. 괄호는 괄호 안의 내용을 그룹 #1 에 저장합니다.
    // ([^<]+) : HTML 시작 및 태그 사이의 모든 텍스트와 일치합니다. "<"기호를 사용할수 없다는 점에
    // 텍스트에 특별한 제한을 둡니다. 괄호안의 문자는 그룹 #2에 저장됩니다.
    // </ \\ 1 > : 이전 시작 중괄호에 해당하는 HTML 끝 중괄호와 일치하는것입니다.
    // \ 1 은 그룹 #1 모든 테텍스트와 일치합니다.

    static Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");


    public static String[] SplitTagString(String line) {
        Matcher mat = pattern.matcher(line);
        int find = 0;

        while (mat.find()) {
            System.out.println(mat.group(2));
            find = 1;
        }
        if (find == 0) System.out.println("None");

        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            //Write your code here
            String[] abc = null;
            abc = SplitTagString(line);

            testCases--;
        }
    }
}