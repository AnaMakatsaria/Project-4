package org.example;

public class Task1SwapStrings {
    /*1. Write a program to swap 2 String without a temporary variable?*/

    public static void main(String[] args) {
        String a="Hello ";
        String b="Java";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
