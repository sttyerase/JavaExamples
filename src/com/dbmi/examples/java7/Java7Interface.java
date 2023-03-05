package com.dbmi.examples.java7;

// Java 7 program to illustrate
// private METHODS in interfaces
public interface Java7Interface {
    void method(int n);
} // INTERFACE

class Java7Demo implements Java7Interface {
    @Override
    public void method(int n)
    {
        if (n % 2 == 0)
            System.out.println( n + " is even.");
        else
            System.out.println( n + " is odd.");
    } // METHOD(INT)

    public static void main(String[] args)
    {
        Java7Interface in1 = new Java7Demo();
        Java7Interface in2 = new Java7Demo();
        in1.method(328);
        in2.method(177);
    } // MAIN(STRING[])
} // CLASS
