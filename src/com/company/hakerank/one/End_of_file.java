package com.company.hakerank.one;

import java.io.IOException;
import java.util.Scanner;

public class End_of_file {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner line = new Scanner(System.in);
        int counter = 1;

        while (line.hasNextLine()) {
            String s = line.nextLine();

            System.out.println(counter + " " + s);
            counter++;
        }

    }
}

