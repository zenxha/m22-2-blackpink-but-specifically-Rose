package com.example.sping_portfolio.algorithms.KSalgorithms;

import com.example.sping_portfolio.controllers.consoleUI.ConsoleMethods;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import lombok.Getter;

/*
 _Fibonacci class contains generalized logic to capture and analyze a Fibonacci sequence.
 _Fibonacci is an "abstract" class, meaning it can't be initialized directly
 The "_" in name is used to push this "Parent" Class to top of package file listing.
 */
@Getter  // this will enable standard Getters on attributes in Class in form "getName" where "name" is attribute
public abstract class _ContainsE {
    String word;
    String yesOrNo;
    String name;
    Duration timeElapsed;
    ArrayList<String> list;

    public _ContainsE(String word) {
        this.word = word.toUpperCase(Locale.ROOT);
        this.list = new ArrayList<>();
        //initialize  time algorithm
        Instant start = Instant.now();  // time capture -- start
        this.init();
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);

    }

    public _ContainsE() {
        this("hi");
    }

    /*
     Method is abstract as init() requires extender to define their own Fibonacci algorithm
     Method is protected as it is only authorized to someone who extends the class
     */
    protected abstract void init();

    /*
     Number is added to Fibonacci sequence, current state of "list" is added to hash for hashID "num"
     */
    public void setData(String results) {
        list.add(results);
        yesOrNo = results;
        // hash.put(this.hashID++, list.clone());

    }

    /*
     Custom Getter for timeElapsed in init process, timeElapsed.getNano() is part of Duration class
     */
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public static void main(String[] args) {
        ContainsEFor.main(null);
        ContainsEBuiltIn.main(null);
        ContainsEWhile.main(null);
        ContainsERecursive.main(null);
//        ExpWhile.main(null);
    }
}