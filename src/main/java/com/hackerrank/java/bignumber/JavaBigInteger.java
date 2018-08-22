package com.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger one = sc.nextBigInteger();
        BigInteger two = sc.nextBigInteger();

        System.out.println(one.add(two));
        System.out.println(one.multiply(two));
    }
}