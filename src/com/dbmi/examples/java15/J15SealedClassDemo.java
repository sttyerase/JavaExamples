package com.dbmi.examples.java15;

public class J15SealedClassDemo {
    public static void main(String[] args) {
        LinkedList<String> emptyList = new LinkedList.Nil<>();
        System.out.println(emptyList);
        LinkedList<String> oneElementList = new LinkedList.Cons<>("Test", new LinkedList.Nil<>());
        System.out.println(oneElementList);
    }
} // CLASS
