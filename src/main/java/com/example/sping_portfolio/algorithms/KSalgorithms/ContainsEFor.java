package com.example.sping_portfolio.algorithms.KSalgorithms;

import com.example.sping_portfolio.algorithms.KSalgorithms._ContainsE;

public class ContainsEFor extends _ContainsE {
    public ContainsEFor(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "For Loop";
        for(int i = 0; i < super.word.length(); i++) {
            if(super.word.charAt(i) == 'E') {
                super.setData("yes");
            }
        }
    }
}