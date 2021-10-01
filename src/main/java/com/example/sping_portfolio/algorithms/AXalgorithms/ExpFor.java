package com.example.sping_portfolio.algorithms.AXalgorithms;

public class ExpFor extends _Exponential {
    // zero and one argument constructors, both defer to super
    public ExpFor() { super(); }
    public ExpFor(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using For
     */
    @Override
    protected void init() {
        super.name = "Method 1";
        long limit = super.size + 1;
        // for loops are likely the most common iteration structure, all the looping facts are in one line
        for (long[] f = new long[]{0, 2}; limit-- > 0; f = new long[]{f[1], f[1] * 2})
            super.setData(f[0]);
    }

    /*
    Class method "main" with purpose of testing FibFor
     */
    public static void main(String[] args) {
        _Exponential fibonacci = new ExpFor(); // "FibFor" is used as initializer for the "_Fibonacci fibonacci"  object
        fibonacci.print();
    }
}
