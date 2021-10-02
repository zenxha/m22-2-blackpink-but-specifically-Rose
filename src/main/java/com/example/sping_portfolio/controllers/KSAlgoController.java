package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.algorithms.KSalgorithms.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class KSAlgoController {

    public List<_ContainsE> checkInit(String word) {
        //Fibonacci objects created with different initializers
        List<_ContainsE> theList = new ArrayList<>();
        theList.add(new ContainsEFor(word));
        theList.add(new ContainsEBuiltIn(word));
        System.out.println(theList);
        return theList;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/check")
    public String fib(@RequestParam(name="word", required=false,  defaultValue="mort") String word, Model model) {


        //MODEL attributes are passed back html
        model.addAttribute("checkList", checkInit(word));
        model.addAttribute("word", word);
        return "algo/check"; //HTML render fibonacci results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {

    }
}
