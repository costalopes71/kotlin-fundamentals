package com.costalopes.module4;

public class JavaApp {

    // calling Kotlin code from within Java code
    public static void main(String[] args) {

        DisplayFunctions.display("Hello World from Java code!");

        // using Kotlin functions with default parameters from within Java
        DisplayFunctions.log("Using the default parameter");
        DisplayFunctions.log("Not using the default parameter", 3);

    }

}
