package com.assignment19;

import java.util.Arrays;
import java.util.Vector;

public class Code1 {
    //1. Write a Java program that creates a `Vector` of integers.
    // Add the numbers 10, 20, 30, 40, and 50 to the vector.
    // Retrieve and print the element at the second index (third element) in the vector. Then, print all elements in the vector.
    public static void main(String[] args) {
        Vector<Integer> elements=new Vector<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Element at 2nd index: "+elements.get(2));
        System.out.println("All the elements: "+elements);
    }
}
