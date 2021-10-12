package com.example.sping_portfolio.algorithms.TMalgorithms;
import java.lang.Math;

public class CubeRecurse extends _Cube {
    public CubeRecurse() {
        super();
    }
    public CubeRecurse(int nth) {
        super(nth);
    }

    //polymorph init for recursion
    @Override
    protected void init() {
        //setup
        super.name = "Cube Recursion";
        long limit = super.size + 1;
        long[] f = new long[]{0, 2};
        initRecurse(limit,f);
    }

    /*
    Recursive methods contains an escape, in this  "base condition" with a limit
    VERY IMPORTANT... recursion requires pre-decrement, post-decrement will not occur until unstacking
     */
    private void initRecurse(long limit, long[] f) {
        //condition for exiting the recursion
        if (limit == 0) return;
        super.setData(f[0]);
        initRecurse(--limit, new long[]{f[1], (long) Math.pow(f[1],3)});
    }


    //fibrecurse testing method
    public static void main(String[] args) {
        // fibrecurse initializes the fibonacci objects
        _Cube fibonacci = new CubeRecurse();
        fibonacci.print();
    }
}
