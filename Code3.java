package com.assignment19;

import java.util.Arrays;
import java.util.Vector;

public class Code3 {
    //3. Write a Java program that initializes a `Vector` of strings with the values {"red", "green", "blue", "yellow"}.
    // Convert the vector to an array, print the array, then convert the array back to a vector and print the resulting vector.
    public static void main(String[] args) {
        Vector<String> s=new Vector<>();
        s.add("red");
        s.add("green");
        s.add("blue");
        s.add("yellow");

        System.out.println("Vector to Array: ");
        String arr[]=new String[s.size()];
        s.copyInto(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Array to Vector: \n"+new Vector<>(Arrays.asList(arr)));
    }
}
