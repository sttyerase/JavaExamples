package com.dbmi.examples.streams;

import java.util.List;

import static java.util.Arrays.asList;

public class StreamDemo {
    List<String> guitarMakers;

    public StreamDemo() {
        guitarMakers = asList("Fender","Gibson", "PRS","Ibanez", "Takemine","Yamaha","","Wallace Detroit","Martin"); // EMPTLY STRING INTENTIONAL
        System.out.println("CONSTRUCTED: ");
    } // CONSTRUCTOR()

    public long printList() {
        return guitarMakers.stream()
                .count();  // EAGER
    } // PRINTLIST()

    public long printList2() {
        return guitarMakers.stream()
                .filter(maker -> { // ALWAYS RETURNS BOOLEAN??
                    System.out.println(maker.toUpperCase());  // PRINTS EVERY STRING IN THE LIST: DON'T DO THIS IN REAL CODE
                    return maker.length() > 0;
                })
                .count();
    } // PRINTLIST2()

    public static void main(String[] args) {
        StreamDemo myDemo = new StreamDemo();
        System.out.println("Count of all makers: " + myDemo.printList());
        System.out.println("Count of non-empty : " + myDemo.printList2());
    } // MAIN(STRING[])

} // CLASS
