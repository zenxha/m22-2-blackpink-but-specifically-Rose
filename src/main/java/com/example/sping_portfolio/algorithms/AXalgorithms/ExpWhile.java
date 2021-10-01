package com.example.sping_portfolio.algorithms.AXalgorithms;

public class ExpWhile extends _Exponential {
    public ExpWhile() {
        super();
    }
    public ExpWhile(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using While
    */
    @Override
    protected void init() {
        super.name = "Method 4";
        // longer and more error prone "while" syntax is often best performer in this small scale test
        long limit = super.size;
        long[] f = new long[]{0, 1};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[1] + f[1]};
        }
    }

    /*
    Class method "main" with purpose of testing FibWhile
     */
    public static void main(String[] args) {
        _Exponential fibonacci = new ExpWhile();
        fibonacci.print();
    }
}
