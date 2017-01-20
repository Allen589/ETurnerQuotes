package com.example.myapplication;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quotes {
    List<String> quotes;
    Random randomGenerator;

    public Quotes() {
        randomGenerator = new Random();
        quotes = new ArrayList<String>();
    }

    public void addQuote(String s) {
        quotes.add(s);
    }

    public String getQuote() {
        int index = randomGenerator.nextInt(quotes.size());
        return quotes.get(index);
    }


}
