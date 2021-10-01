package com.example.sping_portfolio;

import com.example.sping_portfolio.algorithms.TMalgorithms.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Controller
public class TMNumSortController {

    public List<_Numsort> fibInit(int nth) {
        //Fibonacci objects created with different initializers
        List<_Numsort> fibList = new ArrayList<>();
        fibList.add(new NumBubble(nth));
        fibList.add(new NumInsert(nth));
        fibList.add(new NumSelect(nth));
        fibList.add(new NumMerge(nth));

        return fibList;
    }
}
