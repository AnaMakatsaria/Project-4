package org.example;

public class Task6CountVowels {
    public static int countVowels(String str){
        String vowelString=str.replaceAll("[^aeiouAEIOU]","");
        return vowelString.length();
    }

}
class CountVowels{
    public static void main(String[] args) {
        System.out.println( Task6CountVowels.countVowels("documentation"));
    }

}
