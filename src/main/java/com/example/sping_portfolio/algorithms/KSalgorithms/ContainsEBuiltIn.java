package com.example.sping_portfolio.algorithms.KSalgorithms;

import com.example.sping_portfolio.algorithms.AXalgorithms.ExpFor;
import com.example.sping_portfolio.algorithms.AXalgorithms._Exponential;
import com.example.sping_portfolio.algorithms.KSalgorithms._ContainsE;

public class ContainsEBuiltIn extends _ContainsE {
    public ContainsEBuiltIn() {super();}
    public ContainsEBuiltIn(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "Built in Method";
        if(super.word.contains("E")) {
            super.setData("yes");

        } else super.setData("no");
    }
    public static void main(String[] args) {
        _ContainsE con = new ContainsEBuiltIn(); // "FibFor" is used as initializer for the "_Fibonacci fibonacci"  object
        // con.print();
    }
}