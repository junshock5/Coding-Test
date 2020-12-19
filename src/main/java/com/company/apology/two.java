package main.java.com.company.apology;

class two {
    public static String solution(String p, int n) {
        String answer = null;

        String[] splits = p.split(" ");
        String ampm = splits[0];
        p = splits[1];
        splits = p.split(":");

        int hour = Integer.parseInt(splits[0]);
        int min = Integer.parseInt(splits[1]);
        int sec = Integer.parseInt(splits[2].substring(0, 2)) + n;


        if (ampm.equals("PM")) {
            hour = hour + 12;
        }
        if (sec == 60) {
            sec = 0;
            min += 1;
        }
        if (min == 60) {
            min = 0;
            hour += 1;
        }
        if (hour == 12 && ampm.equals("AM")) {
            hour = 0;
        }
        if (hour == 24 && ampm.equals("PM")) {
            hour = 0;
        }

        answer = String.format("%02d:%02d:%02d", hour, min, sec);

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("AM 12:59:59", 1));

    }


}
