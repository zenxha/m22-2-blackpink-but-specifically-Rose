package com.example.sping_portfolio.algorithms.KSalgorithms;

import com.example.sping_portfolio.algorithms.AXalgorithms.ExpFor;
import com.example.sping_portfolio.algorithms.AXalgorithms._Exponential;
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
            }
        }
    }
    public static void main(String[] args) {
        _ContainsE con = new ContainsEFor(); // "FibFor" is used as initializer for the "_Fibonacci fibonacci"  object
       // con.print();
    }
}