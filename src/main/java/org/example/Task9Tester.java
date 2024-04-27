package org.example;

import static org.example.Task9.FirstNoRepCharacter;

public class Task9Tester{
    public static void main(String[] args) {
        String a="abracadabra";
        Character firstChar=FirstNoRepCharacter(a);
        System.out.println("the first non-repeating character is "+firstChar);

    }
    
}
