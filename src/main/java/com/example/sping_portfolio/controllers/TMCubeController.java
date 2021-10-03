package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.algorithms.CZalgorithms.*;
import com.example.sping_portfolio.algorithms.TMalgorithms.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TMCubeController {

    public List<_Cube> fibInit(int nth) {
        //Fibonacci objects created with different initializers
        List<_Cube> fibList = new ArrayList<>();
        fibList.add(new CubeFor(nth));
        fibList.add(new CubeWhile(nth));
        fibList.add(new CubeRecurse(nth));
        fibList.add(new CubeStream(nth));
        System.out.println(fibList + " ");
        return fibList;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/cube")
    public String fib(@RequestParam(name="fibseq", required=false,  defaultValue="0") String fibseq, Model model) {
        //nth is fibonacci request
        int nth = Integer.parseInt(fibseq);

        //MODEL attributes are passed back html
        model.addAttribute("fibList", fibInit(nth));
        // System.out.println(fibInit(nth).get(0));
        return "home/cube"; //HTML render fibonacci results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<_Cube> fibList = new TMCubeController().fibInit(nth);

        for (_Cube fibonacci : fibList)
            fibonacci.print();  //Console output fibonacci results
    }

}
