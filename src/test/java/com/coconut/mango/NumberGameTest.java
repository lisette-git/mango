package com.coconut.mango;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberGameTest {
    NumberGame num = new NumberGame();

    @Test
    public void givenPrime_returnTrue() {
        String str = num.primeNumberCheck(5);
        Assert.isTrue(Boolean.parseBoolean(str),"true");
    }
    @Test
    public void givenNotPrime_returnFalse() {
        String str = num.primeNumberCheck(6);
        assertEquals(str,"false");
    }

    @Test
    public void givenNumber_returnPrimeList() {
        List givenList = num.primeCalculator(12);
        ArrayList<Integer> checkList = Lists.newArrayList(2,3, 5, 7, 11);
        assertEquals(givenList,checkList);
    }

}
