package com.coconut.mango;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class MangoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoApplication.class, args);

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a String");

    String userInput = myObj.nextLine();  // Read user input

    reverseString(userInput);
}
    private static void reverseString(String input) {
        // For this challenge, the input is a string of words,
        // and the output should be the words in reverse but with the letters in the original order.
        // For example, the string “Dog bites man” should output as “man bites Dog.”

        int length = input.length();
        int space = input.indexOf(' ');

        if (length == 0) {
            System.out.println("no input given");
        } else if (space == -1 && length > 0) {
            System.out.println(input);
        } else {

            ArrayList<Integer> spaceList = new ArrayList<Integer>();
            spaceList.add(space);

            int nxtSp = 0;
            while(nxtSp > -1)
            nxtSp = input.indexOf(' ',space);
            if (nxtSp >-1) spaceList.add(nxtSp);
        }

    }
}

