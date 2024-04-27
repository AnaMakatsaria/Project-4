package org.example;


/*Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.*/

import java.util.HashSet;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        Set<Integer>numbers=new HashSet<>();
        numbers.add(25);
        numbers.add(25);
        numbers.add(33);
        numbers.add(22);
        numbers.add(25);
        System.out.println(numbers);
    }

}
