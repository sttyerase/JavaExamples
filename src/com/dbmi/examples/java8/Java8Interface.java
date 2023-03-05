package com.dbmi.examples.java8;

// Java 8 program to illustrate
// static, default and abstract methods in interfaces
/**
 *  Some new features to interface were introduced in Java 8 i.e. Default methods and Static
 *  methods feature. In Java 8, an interface can have only four types:
 *
 * Constant variables
 * Abstract methods
 * Default methods
 * Static methods
 * **/
public interface Java8Interface {

    void div(int a, int b);

    default void
    add(int a, int b)
    {
        System.out.print("Answer by Default method = ");
        System.out.println(a + b);
    }

    static void mul(int a, int b)
    {
        System.out.print("Answer by Static method = ");
        System.out.println(a * b);
    }
}

class Java8Demo implements Java8Interface {

    @Override
    public void div(int a, int b)
    {
        System.out.print("Answer by Abstract method = ");
        System.out.println(a / b);
    }

    public static void main(String[] args)
    {
        Java8Interface in = new Java8Demo();
        in.div(8, 2);
        in.add(3, 1);
        Java8Interface.mul(4, 1);
    }
}
