package com.example.sping_portfolio.algorithms.CZalgorithms;


import com.example.sping_portfolio.algorithms.CZalgorithms._Division;

import java.util.Arrays;

public class DivRecurse extends _Division {
    public DivRecurse() {
        super();
    }
    public DivRecurse(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using Recursion
    */
    @Override
    protected void init() {
        //setup for recursion
        super.name = "DivRecurse";
        long limit = super.size + 1;
        long[] f = new long[]{0, 100000};
        initRecurse(limit,f);
    }


    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;                                 //exit condition
        super.setData(f[0]);

        initRecurse(--limit, new long[]{f[1], f[1]/2});
    }


    public static void main(String[] args) {
        _Division fibonacci = new com.example.sping_portfolio.algorithms.CZalgorithms.DivRecurse();
        fibonacci.print();
    }
}

