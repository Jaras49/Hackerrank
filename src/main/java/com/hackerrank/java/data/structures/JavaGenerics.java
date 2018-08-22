package com.hackerrank.java.data.structures;

public class JavaGenerics {

    <T> void printArray(T[] arr) {

        for (T i : arr)
            System.out.println(i);
    }
}
