package com.example.sping_portfolio.algorithms.TMalgorithms;

import com.example.sping_portfolio.algorithms.AXalgorithms.ExpWhile;
import com.example.sping_portfolio.algorithms.AXalgorithms._Exponential;
import com.example.sping_portfolio.algorithms.CZalgorithms._Division;

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
        // longer and more error prone "while" syntax is often best performer in this small scale test
        long limit = super.size + 1;
        long[] f = new long[]{0, 2};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[1] * 2};
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
