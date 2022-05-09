package com.coconut.mango;

import java.util.Arrays;
import java.util.Collections;

public class NumberGame {
    public void numberReversal(int n) {
        //This one is a technical interview favorite. For a given input number, return the number in reverse.
        // So, an input of 3956 should return 6593.

        int[] intArray = Integer.toString(n).chars().map(a -> a - '0').toArray();

        int res = 0;
        for(int i = intArray.length-1;i >= 0 ;i--) {
            res=res*10+intArray[i];
        }

        System.out.println("reversed number: " + res);


    }




    public boolean primeNumberCheck(int n) {
        //A prime number is any whole number greater than 1 whose only factors are 1 and itself.
        // returns TRUE if an input number is prime.
        // The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, and 19.

        for ( int i=2; i < n; i++) {
           if (n % i == 0) {
               return false;
           } ;
        }
        return true;

    }

    public void primeCalculator(int n) {
        // A prime number calculator that outputs all prime numbers between 2 and the input number.
        System.out.println("prime numbers: ");
        for (int i = 2; i <= n; i++) {
            if (primeNumberCheck(i))
                System.out.println(i);
        }
    }

}
