package com.company.hakerank.two;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//        반복되는 단어와 일치하는 RegEx를 작성하십시오.
//        컴파일 된 RegEx가 대소 문자를 구분하지 않도록 두 번째 컴파일 인수를 완료하십시오 .
//        반복되는 각 단어가 문장에서 찾은 첫 번째 단어로
//        대체되도록 replaceAll에 대한 두 개의 필수 인수를 작성하십시오 .
//        예상되는 출력은 대소 문자를 구분하므로 단어 의 정확한 첫 번째 발생 이어야합니다 .
//        단어로 대체되도록 replaceAll에 대한 두 개의 필수 인수를 작성하십시오

// Pattern.CASE_INSENSITIVE 대소문자 구분을 하는 매치를 수행한다. 기본적으로 US-ASCII에 한해서 대소문자 구분이 기본값으로 지정되어 있다.
// 유니코드의 경우 특정 UNICODE_CASE 플래그에 의해서 케이스를 고려하여 매치를 수행한다. Case-insensitive 매치 역시 가능하며,
// 이것은 표현식을 내장 플래그인 ?i로 지정함으로 해서 가능하다. 이 플래그가 지정하면 작은 성능상의 패널티가 있다.

public class My_Regex2 {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}