package com.example.sping_portfolio.algorithms.KSalgorithms;

public class ContainsERecursive extends _ContainsE {
    public ContainsERecursive() {super();}
    public ContainsERecursive(String word) {
        super(word);
    }

    @Override
    protected void init() {
        super.name = "recursively";
        int occurences = countChr(super.word);
        if(occurences == 0) super.setData("nope");
        else super.setData("yep");
    }
    static int countChr(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        if (str.substring(0, 1).equals("E")) {
            count = 1;
        }
        return count + countChr(str.substring(1));
    }
    public static void main(String[] args) {
        _ContainsE con = new ContainsERecursive(); // "FibFor" is used as initializer for the "_Fibonacci fibonacci"  object
        // con.print();
    }
}