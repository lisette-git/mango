package com.coconut.mango;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

@Component
public class WordGame {

    String reverseString(String input) {
        // The input is a string of words, and the output should be the words in reverse but with the letters in the original order.
        // For example, the string “Dog bites man” should output as “man bites Dog.”


        String[] aaa = input.split(" ");
        Collections.reverse(Arrays.asList(aaa));
        StringBuilder result = new StringBuilder();

        Arrays.asList(aaa).stream()
                .forEach(i -> result.append(i + " "));


        return String.valueOf(result);


    }

    public String anagram(String in1, String in2) {
// Anagrams
//Two words are anagrams if they contain the same letters but in a different order.

//As an added challenge, for a given array of strings, return separate lists that group anagrams together.


        char[] chars1 = in1.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        String out1 = new String(chars1);
        char[] chars2 = in2.toLowerCase().toCharArray();
        Arrays.sort(chars2);
        String out2 = new String(chars2);
        boolean bln = out1.equals(out2);
//                System.out.println("anagram: " + String.valueOf(bln));
        return String.valueOf(bln);
    }
}
