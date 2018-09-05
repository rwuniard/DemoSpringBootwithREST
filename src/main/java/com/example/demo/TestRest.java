package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="test")
public class TestRest {

    @RequestMapping(value="hello", method= RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(value="print/{myString}", method=RequestMethod.GET)
    public String print(@PathVariable String myString) {
        return myString;
    }


    @RequestMapping(value="submit/", method=RequestMethod.POST)
    public Person getPerson(@RequestBody Person person) {
        return person;
    }
}
