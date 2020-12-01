package com.company.hakerank.two;

import java.util.*;


class Student {
    private int token;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getToken() {
        return token;
    }

    public String getName() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> student_queue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getToken));
        List<Student> students = new ArrayList<Student>();
        for (String e : events) {
            Scanner in = new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int token = in.nextInt();

                Student student = new Student(token, name, cgpa);
                student_queue.add(student);
            } else if (event.equals("SERVED")) {
                Student first = student_queue.poll();
            }
            in.close();
        }
        // poll ()은 remove ()와 유사하게 작동합니다. 유일한 차이점은 대기열이 비어있는 경우입니다. 이 경우 poll ()은 null 값을 반환하고 remove ()는 NoSuchElementException을 throw합니다.
        // poll ()은 peek ()와 비교할 수 있지만 remove ()는 아닙니다 .... head first 요소를 제공하고 요소를 제거하지만 peek ()는 요소를 검색하는 데만 사용됩니다.
        Student first = student_queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = student_queue.poll();

            }
            return students;
        }

    }
}

public class Priority_Queue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}