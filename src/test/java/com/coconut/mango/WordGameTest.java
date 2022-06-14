package com.coconut.mango;


import org.junit.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WordGameTest {
    WordGame word = new WordGame();

    @Test
    public void givenString_getReverseTest() {
        String in = "iene miene mutte tien pond grutte";
        String check = "grutte pond tien mutte miene iene ";
        String out = word.reverseString(in);
        assertEquals(check,out);
    }

    @Test
    public void givenString_getAnagramTest() {
        String in1 = "Debit card";
        String in2 = "Bad credit";
        String out = word.anagram(in1, in2);
        assertEquals(true,Boolean.parseBoolean(out));
    }
    @Test
    public void givenDiffString_getAnagramTest() {
        String in1 = "flamingo";
        String in2 = "flaming";
        String out = word.anagram(in1, in2);
        assertEquals(false,Boolean.parseBoolean(out));
    }
}
