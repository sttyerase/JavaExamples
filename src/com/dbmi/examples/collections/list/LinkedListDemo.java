package com.dbmi.examples.collections.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class LinkedListDemo {

    private final LinkedList<String> myStringList;
    private final String[] myStringArray = {"Bob", "Carol", "Ted", "Alice"};

    public LinkedListDemo() {
        myStringList = new LinkedList<String>(List.of(myStringArray));
    } // NULL CONSTRUCTOR

    public void init() {
        myStringList.add(3,"Jerry");
        myStringList.add("Jason");
    } // INIT()

    public static void main(String[] args) {
        LinkedListDemo myDemo = new LinkedListDemo();
        myDemo.init();
        myDemo.myStringList.stream().forEach(System.out::println);
    } // MAIN(STRING[])

} // CLASS
