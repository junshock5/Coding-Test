package com.company.hakerank.one;
import java.io.*;

public class Date_and_Time {

    static int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String str[] = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
    static int nalsu = 0, week = 0;

    public static String findDay(int month, int day, int year) {

        //윤년 먼저 계산
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            months[1] = 29;

        //1년 1월1일부터 ~ 현재년의 전년도 12월 31일까지의 날수
        //+ 2018년까지의 윤년 수
        nalsu = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

        for (int i = 0; i < month - 1; i++) {
            nalsu += months[i];
        }

        nalsu += day; // d일 까지의 날수

        //주의 수 (0 1 2 3 4 5 6)
        week = nalsu % 7; //1일때는 월요일 ,2일때는 화요일

        System.out.printf(str[week].toUpperCase());

        return null;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}