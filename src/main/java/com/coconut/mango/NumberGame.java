package com.coconut.mango;

import java.util.Arrays;
import java.util.Collections;

public class NumberGame {
    public void numberReversal(int n) {
        //This one is a technical interview favorite. For a given input number, return the number in reverse.
        // So, an input of 3956 should return 6593.
        //
        //If you’re ready for a bigger challenge, reverse a decimal number. The decimal point should stay in the same place.
        // So, the number 193.56 should output 653.91.

        int[] intArray = Integer.toString(n).chars().map(a -> a - '0').toArray();

        int res = 0;
        for(int i = intArray.length-1;i >= 0 ;i--) {
            res=res*10+intArray[i];
        }

        System.out.println("reversed number: " + res);


    }




    public void primeNumberCheck(int n) {
        // Prime number checker
        //A prime number is any whole number greater than 1 whose only factors are 1 and itself.
        // For example, 7 is a prime number because it’s only divisible by 1 and 7.
        //
        //Create a function that returns TRUE if an input number is prime.
        // The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, and 19.
        //
        //For a slightly harder challenge, create a prime number calculator that outputs all prime numbers between 2 and the input number.
        boolean prime = false;
        int remainder = 0;
        for ( int i=2; i < n/2; i++) {
//            System.out.println("i=  " + i + "  n=  " + n);
           if (n % i == 0) {
               System.out.println(n + " is not a prime number");
//               break;
               return;
           } ;

        }
        System.out.println(n + " is a prime number");
        return;

    }
}
