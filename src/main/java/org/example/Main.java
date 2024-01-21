package org.example;

import org.example.december1.Trebuchet;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Trebuchet trebuchet = new Trebuchet(new File("src/main/java/org/example/december1/puzzle-input.txt"));
        System.out.println("Sum = " + trebuchet.calculateSum());
    }
}