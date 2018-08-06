package com.hackerrank.java.strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";

        String[] substrings = new String[s.length() - (k - 1)];

        int arrayIndex = 0;
        int startIndex = 0;
        int endIndex = k;
        boolean go = true;
        while (go) {
            String substring = s.substring(startIndex, endIndex);
            substrings[arrayIndex] = substring;
            arrayIndex++;
            startIndex++;
            endIndex++;
            if (endIndex > s.length()) {
                go = false;
            }
        }
        for (int i = 0; i < substrings.length; i++) {
            for (int j = 0; j < substrings.length; j++) {
                if (i == j) {
                    continue;
                }
                if (substrings[i].compareTo(substrings[j]) < 0) {
                    String temp = substrings[i];
                    substrings[i] = substrings[j];
                    substrings[j] = temp;
                }
            }
        }
        smallest = substrings[0];
        largest = substrings[substrings.length - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
