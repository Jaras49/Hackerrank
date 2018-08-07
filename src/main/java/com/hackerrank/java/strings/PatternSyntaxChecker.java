package com.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        int testCase = 0;
        while (testCases > testCase) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("VALID");
            } catch (PatternSyntaxException e) {
                System.out.println("INVALID");
            } finally {
                testCase++;
            }
        }
    }
}
