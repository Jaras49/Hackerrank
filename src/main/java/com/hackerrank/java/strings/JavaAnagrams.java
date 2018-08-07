package com.hackerrank.java.strings;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {

        char[] charsA = a.toLowerCase().toCharArray();
        char[] charsB = b.toLowerCase().toCharArray();

        for (int i = 0; i < charsA.length; i++) {
            for (int j = 0; j < charsA.length; j++) {
                if (i == j) {
                    continue;
                }
                if (Character.compare(charsA[i], charsA[j]) < 0) {
                    char temp = charsA[i];
                    charsA[i] = charsA[j];
                    charsA[j] = temp;
                }
            }
        }

        for (int i = 0; i < charsB.length; i++) {
            for (int j = 0; j < charsB.length; j++) {
                if (i == j) {
                    continue;
                }
                if (Character.compare(charsB[i], charsB[j]) < 0) {
                    char temp = charsB[i];
                    charsB[i] = charsB[j];
                    charsB[j] = temp;
                }
            }
        }

        boolean anagrams = true;
        if (charsA.length != charsB.length) {
            anagrams = false;
        } else {
            for (int i = 0; i < charsA.length; i++) {
                if (charsA[i] != charsB[i]) {
                    anagrams = false;
                    break;
                }
            }
        }

        return anagrams;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
