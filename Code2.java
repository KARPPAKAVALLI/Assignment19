package com.assignment19;

import java.util.Vector;

public class Code2 {
    //2. Write a Java program that creates a `Vector` of doubles.
    // Add five random double values to the vector. Check if the value 10.5 is in the vector.
    // Print the size of the vector before and after adding an additional value.
    public static void main(String[] args) {
        Vector<Double> doubles=new Vector<>();
        doubles.add(10.9);
        doubles.add(23.75);
        doubles.add(-20.89);
        doubles.add(15.67);
        doubles.add(27.965);
        System.out.println("Vector contains 10.5 ? "+(!doubles.contains(10.5)?"No":"Yes"));
        System.out.println("Size of vector before adding an additional value: "+doubles.size());
        doubles.add(78.653);
        System.out.println("Size of vector after adding an additional value: "+doubles.size());
    }
}
