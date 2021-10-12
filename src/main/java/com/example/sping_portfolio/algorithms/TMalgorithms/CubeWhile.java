package com.example.sping_portfolio.algorithms.TMalgorithms;

import java.lang.Math;
public class CubeWhile extends _Cube{
    public CubeWhile() {
        super();
    }
    public CubeWhile(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using While
    */
    @Override
    protected void init() {
        super.name = "While Cube";
        // this longer while loop ensures the limit does not get reached, performs best
        long limit = super.size + 1;
        long[] f = new long[]{0, 2};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], (long) Math.pow(f[1],3)};
        }
    }

    /*
    Class method "main" with purpose of testing FibWhile
     */
    public static void main(String[] args) {
        _Cube fibonacci = new CubeWhile();
        fibonacci.print();
    }
}
