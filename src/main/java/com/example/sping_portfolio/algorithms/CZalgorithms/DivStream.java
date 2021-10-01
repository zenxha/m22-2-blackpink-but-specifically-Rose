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

    /*
    Abstract Polymorphic "init()" method using Stream and Lambda expressions hello
    */
    @Override
    protected void init() {
        super.name = "Method 3";
        // Stream iterates using lambda "->" syntCZ unil ".limit" is reached
        // Streams and Lambda have been added to more recent versions of Java, this will NOT be on AP Test
        // Streams are prevalent in Big Data, in this example it seems to perform the worst
        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[1] + f[1]})
                .limit(super.size)
                .forEach(f -> super.setData(f[0]) );
    }

    /*
    Class method "main" with purpose of testing FibStream
     */
    public static void main(String[] args) {
        _Division fibonacci = new com.example.sping_portfolio.algorithms.CZalgorithms.DivStream();
        fibonacci.print();
    }
}
