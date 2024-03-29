package com.dbmi.examples.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class SimpleStreamDemo {
    public static void main(String[] args) {
        String[] wordle_words = new String[]  { "plant","sheet","taste","force","starch","sack","clasp"};
        Stream<String> wordleStream = Arrays.stream(wordle_words);
        wordleStream.filter(e -> e.length() != 5)
                .forEach(e -> System.out.println("NOT A WORDLE WORD: " + e + " -- LENGTH: " + e.length()));
        wordleStream = Arrays.stream(wordle_words);  // MUST RECREATE STREAM AFTER USE
        wordleStream.filter((e -> e.length() == 5))
                .forEach(e -> System.out.println("WORDLE WORD: " + e));

    } // MAIN(STRING[])
} // CLASS
