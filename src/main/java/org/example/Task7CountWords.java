package org.example;

public class Task7CountWords {
    /*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2*/
    public static int counter(String string){

        return string.split("[, .!?]").length;
    }

}
class countWords{
    public static void main(String[] args) {
        System.out.println(Task7CountWords.counter("Hello, world!"));

    }
}
