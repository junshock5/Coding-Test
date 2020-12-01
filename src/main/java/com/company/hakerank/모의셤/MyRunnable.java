package com.company.hakerank.모의셤;


class Sample implements Runnable{
    private Thread t;
    private String threadName;

    Sample(String threadName){
        this.threadName=threadName;
    }
    public void run(){
        while(true)
        System.out.println(threadName);
    }


    public void start2()
    {
        if( t==null)
        {
            t= new Thread(this,threadName);
            t.start();
        }
    }
}

public class MyRunnable {

    public static void main(String[] args) {
        Sample A = new Sample("a");
        Sample B = new Sample("b");

        System.out.println("ASD");
        A.start2();
        B.start2();
    }
}