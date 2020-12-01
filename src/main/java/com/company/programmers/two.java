package com.company.programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class two {


    public static String solution(String p, int n) throws ParseException {
        String answer = "";
        String temp[] = p.split(" ");
        String ap = temp[0];
        String from = temp[1];

        SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss");
        Date to = transFormat.parse(from);

  


        Date dNow;
        Calendar cal = Calendar.getInstance();
        cal.setTime(to);
        cal.add(Calendar.SECOND, n);

        if (temp[0].equals("PM"))
            cal.add(Calendar.HOUR, 12);

        dNow = cal.getTime();
        answer = transFormat.format(dNow);

        return answer;
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int input = scanner.nextInt();
        String temp = solution(input1, input);
    }

}