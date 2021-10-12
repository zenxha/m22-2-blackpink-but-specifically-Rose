package com.example.sping_portfolio.algorithms.TMalgorithms;
import java.lang.Math;
public class CubeFor extends _Cube {
    public CubeFor() { super(); }
    public CubeFor(int nth) {
        super(nth);
    }

    //Polymorphic, Abstract init() to make for loop
    @Override
    protected void init() {
        //Name for table display
        super.name = "For Cube";
        long limit = super.size + 1;
        // for loop to iterate through list size, Math.pow method for cubing
        for (long[] f = new long[]{0, 2}; limit-- > 0; f = new long[]{f[1], (long) Math.pow(f[1] , 3)})
            super.setData(f[0]);
    }
    //fibfor test
    public static void main(String[] args) {
        // "FibFor" initializes the fibonnaci objects
        _Cube fibonacci = new CubeFor();
        fibonacci.print();
    }
}
