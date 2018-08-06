package com.hackerrank.java.strings;

public class JavaRegex {

    public static void main(String[] args) {

        String[] ipAdresses = new String[]{
                "000.12.12.034", //true
                "121.234.12.12", //true
                "23.45.12.56",  //true
                "000.12.234.23.23", //false
                "666.666.23.23",  //false
                ".213.123.23.32",  //false
                "23.45.22.32.",  //false
                "I.Am.not.an.ip"  //false
        };

        for (String ip : ipAdresses) {

            System.out.println(ip.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String regex = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = regex + "\\." + regex + "\\." + regex + "\\." + regex;
}

