package com.dbmi.examples.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  // TARGET LIMITED TO TYPES OR CLASSES
public @interface MyClassAnnotation {
    int id() default 17;
    String name() default "Crazy Harry";
} // MYCLASSANNOTATION
