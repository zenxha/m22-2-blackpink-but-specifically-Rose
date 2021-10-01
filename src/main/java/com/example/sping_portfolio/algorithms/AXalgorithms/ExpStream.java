package com.example.sping_portfolio.algorithms.AXalgorithms;

import java.util.stream.Stream;

public class ExpStream extends _Exponential {
    public ExpStream() {
        super();
    }
    public ExpStream(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using Stream and Lambda expressions
    */
    @Override
    protected void init() {
        super.name = "Stream";
        // Stream iterates using lambda "->" syntax unil ".limit" is reached
        // Streams and Lambda have been added to more recent versions of Java, this will NOT be on AP Test
        // Streams are prevalent in Big Data, in this example it seems to perform the worst
        Stream.iterate(new long[]{0, 2}, f -> new long[]{f[1], f[1] * 2})
                .limit(super.size + 1)
                .forEach(f -> super.setData(f[0]) );
    }

    /*
    Class method "main" with purpose of testing FibStream
     */
    public static void main(String[] args) {
        _Exponential fibonacci = new ExpStream();
        fibonacci.print();
    }
}
