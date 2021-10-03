package com.example.sping_portfolio.algorithms.CZalgorithms;


import com.example.sping_portfolio.algorithms.CZalgorithms._Division;

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
        long limit = super.size;
        long[] f = new long[]{0, 1};
        initRecurse(limit,f);       // recursion is redirected hello
    }

    /*
    Recursive methods contains an escape, in this  "base condition" with a limit
    VERY IMPORTANT... recursion requires pre-decrement, post-decrement will not occur until unstacking
     */
    private void initRecurse(long limit, long[] f) {
        if (limit == 0) return;                                 //exit condition
        super.setData(f[0]);
        // observe this syntCZ and function, many think of recursion as another way to do iteration
        initRecurse(--limit, new long[]{f[1], f[1]/2});
    }

    /*
    Class method "main" with purpose of testing FibRecurse
     */
    public static void main(String[] args) {
        _Division fibonacci = new com.example.sping_portfolio.algorithms.CZalgorithms.DivRecurse();  // "FibRecurse" is used as initializer for the "_Fibonacci fibonacci"  object
        fibonacci.print();
    }
}

