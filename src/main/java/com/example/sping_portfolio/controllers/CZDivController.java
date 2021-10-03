package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.algorithms.CZalgorithms.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class CZDivController {

    public List<_Division> fibInit(int nth) {
        //Fibonacci objects created with different initializers
        List<_Division> fibList = new ArrayList<>();
        fibList.add(new DivFor(nth));
        fibList.add(new DivWhile(nth));
        fibList.add(new DivRecurse(nth));
        fibList.add(new DivStream(nth));
        System.out.println(fibList + " ");
        return fibList;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/div")
    public String fib(@RequestParam(name="fibseq", required=false,  defaultValue="0") String fibseq, Model model) {
        //nth is fibonacci request
        int nth = Integer.parseInt(fibseq);

        //MODEL attributes are passed back html
        model.addAttribute("fibList", fibInit(nth));
        // System.out.println(fibInit(nth).get(0));
        return "home/div"; //HTML render fibonacci results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 50; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<_Division> fibList = new CZDivController().fibInit(nth);

        for (_Division fibonacci : fibList)
            fibonacci.print();  //Console output fibonacci results
    }
}

