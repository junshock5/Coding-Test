package com.company.hakerank.two;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student2 implements Comparable {
    private int id;
    private String fname;
    private double cgpa;

    public Student2(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o) {
        if( ((Student2) o).getCgpa() == (this.getCgpa())  ){ //학점이 같으면
            return this.getFname().compareTo(((Student2) o).getFname());
        }
        return Double.compare(((Student2) o).getCgpa(), this.getCgpa());
    }
}


public class Comparator_class {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student2> studentList = new ArrayList<Student2>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student2 st = new Student2(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for (Student2 st : studentList) {
            System.out.println(st.getFname());
        }
    }
}



