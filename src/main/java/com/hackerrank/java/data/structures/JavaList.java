package com.hackerrank.java.data.structures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();

        int listSize = sc.nextInt();
        for (int i = 0; i < listSize; i++) {
            int listElement = sc.nextInt();
            list.add(listElement);
        }

        int numberOfQueries = sc.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {

            String queryType = sc.next();
            if (queryType.equals("Insert")) {
                list.add(sc.nextInt(), sc.nextInt());
            } else if (queryType.equals("Delete")) {
                list.remove(sc.nextInt());
            }
        }

        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
