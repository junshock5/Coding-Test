package com.company.hakerank.one;
import java.lang.reflect.Method;

public class Generics {


    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");

    }
}

class Printer<T extends Object> {
    //Write your code here
    public void printArray(T params[]) {
        for (int i = 0; i < params.length; ++i)
            System.out.println(params[i]);
    }

}