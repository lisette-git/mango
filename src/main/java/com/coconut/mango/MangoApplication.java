package com.coconut.mango;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class MangoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoApplication.class, args);

        new NumberGame().primeNumberCheck(19);

//        WordGame wordGame = new WordGame();
//        wordGame.anagram("baby","abbyp");
}




}