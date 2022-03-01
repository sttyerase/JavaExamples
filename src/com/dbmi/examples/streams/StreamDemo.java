package com.dbmi.examples.streams;

import java.util.List;

import static java.util.Arrays.asList;

public class StreamDemo {
    List<String> guitarMakers;

    public StreamDemo() {
        guitarMakers = asList("Fender", "Gibson", "PRS", "Ibanez", "", "Takemine", "Yamaha", "", "Wallace Detroit", "Martin"); // EMPTLY STRINGS INTENTIONAL
        System.out.println("CONSTRUCTED: ");
    } // CONSTRUCTOR()

    // RETURN A COUNT OF ENTRIES IN THE LIST
    public long getCount() {
        return guitarMakers.stream()
                .count();  // EAGER
    } // GETCOUNT()

    // USE A FILTER TO RETURN A LIST WITHOUT EMPTY ENTRIES
    public List<String> trimList() {
        return guitarMakers.stream()
                .filter(maker -> maker.length() > 0).toList();
    } // TRIMLIST()

    public static void main(String[] args) {
        StreamDemo myDemo = new StreamDemo();
        System.out.println("Count of list entries     : " + myDemo.getCount());
        List<String> myList = myDemo.trimList();
        System.out.println("Count of non-empty entries: " + myList.stream().count());
        myList.forEach(System.out::println);  // UNFORMATTED OUTPUT
        // GENERATE FORMATTED OUTPUT
        System.out.println("\n\nLIST OF GUITAR MAKERS: ");
        myList.forEach(maker -> System.out.println("   " + maker));
    } // MAIN(STRING[])

} // CLASS
