package org.example;


import java.util.Arrays;

public class Task5Anagram {
    public static void areAnagrams(String word1,String word2){
        char[]char1=word1.toCharArray();
        char[]char2=word2.toCharArray();
        Arrays.sort(word1.toCharArray());
        Arrays.sort(char2);
if(Arrays.equals(char1, char2)){

    System.out.println(word1 +" and "+word2+ " are anagrams");
}else {
    System.out.println(word1 +" and "+word2+ " aren't anagrams");
}

}
}
