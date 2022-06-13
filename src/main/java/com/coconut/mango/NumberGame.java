package com.coconut.mango;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class NumberGame {

    public String primeNumberCheck(int n) {
        //A prime number is any whole number greater than 1 whose only factors are 1 and itself.
        // returns TRUE if an input number is prime.
        // The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, and 19.

        for ( int i=2; i < n; i++) {
           if (n % i == 0) {
               return "false";
           } ;
        }
        return "true";

    }

    public List primeCalculator(int n) {
        // A prime number calculator that outputs all prime numbers between 2 and the input number.
//        System.out.println("prime numbers: ");
        List list = new ArrayList();
        for (int i = 2; i <= n; i++) {
            if (primeNumberCheck(i).equals("true"))
                list.add(i);
        }
        return list;
    }

}
