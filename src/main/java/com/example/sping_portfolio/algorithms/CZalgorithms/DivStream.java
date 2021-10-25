package com.example.sping_portfolio.algorithms.CZalgorithms;

import com.example.sping_portfolio.algorithms.CZalgorithms._Division;

import java.util.stream.Stream;

public class DivStream extends _Division {
    public DivStream() {
        super();
    }
    public DivStream(int nth) {
        super(nth);
    }


    @Override
    protected void init() {
        super.name = "DivStream";

        Stream.iterate(new long[]{0, 100000}, f -> new long[]{f[1], f[1]/2})
                .limit(super.size + 1)
                .forEach(f -> super.setData(f[0]) );
    }

    /*
    Class method "main" with purpose of testing DivStream
     */
    public static void main(String[] args) {
        _Division fibonacci = new com.example.sping_portfolio.algorithms.CZalgorithms.DivStream();
        fibonacci.print();
    }
}
