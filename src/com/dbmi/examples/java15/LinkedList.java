package com.dbmi.examples.java15;

// EXAMPLE FROM: https://jpintelli.com/2020/12/28/adt-with-java-sealed-classes-pattern-matching-records/

public sealed interface LinkedList<T> permits LinkedList.Nil, LinkedList.Cons {
    record Nil<T>() implements LinkedList<T> {}
    record Cons<T>(T value, LinkedList<T> next) implements LinkedList<T> {}
} // INTERFACE

