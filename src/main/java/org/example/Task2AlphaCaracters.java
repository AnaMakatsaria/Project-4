package org.example;

public class Task2AlphaCaracters {
    //Find out how many alpha characters are present in a string?
    public static void main(String[] args) {
        String string="gljhA875857nbcxbmxn''k@#$5657";
        System.out.println(string.replaceAll("[^a-zA-Z]","").length());

    }




}
