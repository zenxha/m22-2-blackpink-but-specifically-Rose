package com.example.sping_portfolio.algorithms.KSalgorithms;

import com.example.sping_portfolio.controllers.consoleUI.ConsoleMethods;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import lombok.Getter;


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

    protected abstract void init();


    public void setData(String results) {
        list.add(results);
        yesOrNo = results;
        // hash.put(this.hashID++, list.clone());

    }


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