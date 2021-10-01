package com.example.sping_portfolio.controllers.AXalgorithms;

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
        super.name = "Method 3";
        // Stream iterates using lambda "->" syntax unil ".limit" is reached
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
        _Exponential fibonacci = new ExpStream();
        fibonacci.print();
    }
}
