package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.controllers.AXalgorithms.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class AXExponentialController {

    public List<_Exponential> fibInit(int nth) {
        //Fibonacci objects created with different initializers
        List<_Exponential> fibList = new ArrayList<>();
        fibList.add(new ExpFor(nth));
        fibList.add(new ExpWhile(nth));
        fibList.add(new ExpRecurse(nth));
        fibList.add(new ExpStream(nth));

        return fibList;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/expo")
    public String fib(@RequestParam(name="fibseq", required=false,  defaultValue="2") String fibseq, Model model) {
        //nth is fibonacci request
        int nth = Integer.parseInt(fibseq);

        //MODEL attributes are passed back html
        model.addAttribute("fibList", fibInit(nth));

        return "home/expo"; //HTML render fibonacci results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<_Exponential> fibList = new AXExponentialController().fibInit(nth);
        for (_Exponential fibonacci : fibList)
            fibonacci.print();  //Console output fibonacci results
    }
}
