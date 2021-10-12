package com.example.sping_portfolio.algorithms.TMalgorithms;

import java.lang.Math;

import java.util.stream.Stream;

public class CubeStream extends _Cube{
    public CubeStream() {
        super();
    }
    public CubeStream(int nth) {
        super(nth);
    }

    //polymorph init for streams cubing
    @Override
    protected void init() {
        super.name = "Cubing with Streams";
        // Stream iterates using lambda "->" syntax unil ".limit" is reached
        // Streams and Lambda have been added to more recent versions of Java, this will NOT be on AP Test
        // Streams are prevalent in Big Data, in this example it seems to perform the worst
        Stream.iterate(new long[]{0, 2}, f -> new long[]{f[1], (long) Math.pow(f[1],3)})
                .limit(super.size + 1)
                .forEach(f -> super.setData(f[0]) );
    }

   //fibstream test method
    public static void main(String[] args) {
        _Cube fibonacci = new CubeStream();
        fibonacci.print();
    }
}
