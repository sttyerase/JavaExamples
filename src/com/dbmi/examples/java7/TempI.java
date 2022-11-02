package com.dbmi.examples.java7;

// Java 7 program to illustrate
// private methods in interfaces
public interface TempI {
    void method(int n);
} // INTERFACE

class Temp implements TempI {
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
        TempI in1 = new Temp();
        TempI in2 = new Temp();
        in1.method(328);
        in2.method(177);
    } // MAIN(STRING[])
} // CLASS
