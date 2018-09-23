package com.hackerrank.java.data.structures;

import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();
        List<List<Integer>> set = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            int integersInLine = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < integersInLine; j++) {
                list.add(j, sc.nextInt());
            }
            set.add(i, list);
        }

        int noOfQueries = sc.nextInt();
        for (int i = 0; i < noOfQueries; i++) {
            try {
                Integer integer = set.get(sc.nextInt() - 1).get(sc.nextInt() - 1);
                System.out.println(integer);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }
}
