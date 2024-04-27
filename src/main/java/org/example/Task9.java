package org.example;

import java.util.HashMap;

public class Task9 {
    /*Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.*/
    public static Character FirstNoRepCharacter(String a){
        HashMap<Character,Integer> charCount=new HashMap<>();
        for (char c:a.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        for (char c:a.toCharArray()){
            if (charCount.get(c)==1){
                return c;
            }
        }
        return '\0';
    }
}

