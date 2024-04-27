package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;


public class Task8 {
    /*
    You have a list of strings and you want to keep only those that
     start with “A” and you want to return them in lower case".
     */
    public static void main(String[] args) {

        List<String> words = new LinkedList<>();
        words.add("Apple");
        words.add("Apricot");
        words.add("banana");
        words.add("Kiwi");
        words.removeIf(x->!x.startsWith("A"));
        words.forEach(x-> System.out.println(x.toLowerCase(Locale.ROOT)));
        }
      }


