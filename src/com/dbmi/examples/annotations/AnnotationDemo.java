package com.dbmi.examples.annotations;

@MyClassAnnotation
public class AnnotationDemo {
    @MyMethodAnnotation(methodId = 7,methodName = "Antonio")  // MUST PROVIDE VALUES AS NO DEFAULT SPECIFIED
    public static void main(String[] args) {
        System.out.println("STARTING DEMO: ");
    } // MAIN(STRING[])

} // CLASS
