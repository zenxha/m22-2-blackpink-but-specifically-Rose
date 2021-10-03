package com.example.sping_portfolio.algorithms.KSalgorithms;


import com.example.sping_portfolio.algorithms.KSalgorithms._ContainsE;

public class ContainsEWhile extends _ContainsE {
    public ContainsEWhile() {super();}
    public ContainsEWhile(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "While Loop";
        int i = 0;
        while(i < super.word.length()) {
            if(super.word.charAt(i) == 'E') {
                super.setData("yes");
            } else super.setData("no");
            i++;
        }
    }
    public static void main(String[] args) {
        _ContainsE con = new ContainsEWhile(); // "FibFor" is used as initializer for the "_Fibonacci fibonacci"  object
        // con.print();
    }
}