package com.dbmi.examples.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // TARGET LIMITED TO METHODS
public @interface MyMethodAnnotation {
    int methodId();
    String methodName();
} // MYMETHODANNOTATION
