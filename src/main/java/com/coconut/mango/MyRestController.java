package com.coconut.mango;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/game")
public class MyRestController {

    @Autowired
    private NumberGame numbGame = new NumberGame();
    private WordGame wordGame = new WordGame();

//    @PostMapping(path="/", consumes = "application/json", produces="application/json")
//    public playWordGame(@RequestBody )

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<String> post() {
        return new ResponseEntity<String>("POST Response", HttpStatus.OK);
    }

    @PostMapping("/reversal")
    public @ResponseBody ResponseEntity<String> reverseString(@RequestBody String string) {
        String res = wordGame.reverseString(string);
        return new ResponseEntity<String>(res, HttpStatus.OK);
    }

    @PostMapping("/anagram")
    public @ResponseBody ResponseEntity<String> anagram(@RequestHeader(value = "in1", required = false)String in1, @RequestHeader(value = "in2", required = false)String in2) {
        String res = wordGame.anagram(in1,in2);
        return new ResponseEntity<String>(res, HttpStatus.OK);
    }

    @PostMapping("/prime-number-check")
    public @ResponseBody ResponseEntity<String> primeCheck(@RequestHeader(value = "in2", required = false)int in2) {

            String res = numbGame.primeNumberCheck(in2);
            return new ResponseEntity<String>(res, HttpStatus.OK);

    }

    @PostMapping("/prime-calculator")
    public @ResponseBody ResponseEntity<List> primeCalculator(@RequestHeader int in) {
        List res = numbGame.primeCalculator(in);
        return new ResponseEntity<List>(res, HttpStatus.OK);
    }
}
