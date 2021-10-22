package com.example.sping_portfolio.algorithms.CZalgorithms;

import com.example.sping_portfolio.algorithms.CZalgorithms.DivFor;
import com.example.sping_portfolio.algorithms.CZalgorithms.DivRecurse;
import com.example.sping_portfolio.algorithms.CZalgorithms.DivStream;
import com.example.sping_portfolio.algorithms.CZalgorithms.DivWhile;
import com.example.sping_portfolio.controllers.consoleUI.ConsoleMethods;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

import lombok.Getter;


@Getter  // this will enable standard Getters on attributes in Class in form "getName" where "name" is attribute
public abstract class _Division {
    int size;
    String name;
    int hashID;
    Duration timeElapsed;
    ArrayList<Long> list;
    HashMap<Integer, Object> hash;


    public _Division() {
        this( 50);
    }


    public _Division(int nth) {
        this.size = nth;
        this.list = new ArrayList<>();
        this.hashID = 0;
        this.hash = new HashMap<>();

        Instant start = Instant.now();  // time capture -- start
        this.init();
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    /*
     Method is abstract as init() requires extender to define their own Fibonacci algorithm
     Method is protected as it is only authorized to someone who extends the class
     */
    protected abstract void init();

    /*
     Number is added to Fibonacci sequence, current state of "list" is added to hash for hashID "num"
     */
    public void setData(long num) {
        list.add(num);
        hash.put(this.hashID++, list.clone());
    }

    /*
     Custom Getter for timeElapsed in init process, timeElapsed.getNano() is part of Duration class
     */
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }


    public long getNth() {
        return list.get(size - 1);
    }


    public Object getNthSeq(int i) {
        return hash.get(i);
    }


    public void print() {
        ConsoleMethods.println("Init method = " + this.name);
        ConsoleMethods.println("Init time = " + this.getTimeElapsed());
        ConsoleMethods.println("Fibonacci Number " + this.size + " = " + this.getNth());
        ConsoleMethods.println("Fibonacci List = " + this.getList());
        ConsoleMethods.println("Fibonacci Hashmap = " + this.getHash());
        for (int i=0 ; i<this.size; i++ ) {
            ConsoleMethods.println("Fibonacci Sequence " + (i+1) + " = " + this.getNthSeq(i));
        }
    }


    public static void main(String[] args) {
        DivFor.main(null);
        DivRecurse.main(null);
        DivStream.main(null);
        DivWhile.main(null);
    }
}

