package com.example.sping_portfolio.algorithms.KSalgorithms;


import com.example.sping_portfolio.algorithms.KSalgorithms._ContainsE;

public class ContainsEFor extends _ContainsE {
    public ContainsEFor() {super();}
    public ContainsEFor(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "For Loop";
        for(int i = 0; i < super.word.length(); i++) {
            if(super.word.charAt(i) == 'E') {
                super.setData("yes");
            } else super.setData("no");
        }
    }
    public static void main(String[] args) {
        _ContainsE con = new ContainsEFor();
    }
}