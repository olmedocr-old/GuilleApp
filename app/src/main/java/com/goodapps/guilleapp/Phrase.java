package com.goodapps.guilleapp;

/**
 * Created by raul on 2/4/17.
 */

public class Phrase {
    private String phrase, date;
    private int punctuation;

    public Phrase(String date, String phrase, int punctuation) {
        this.phrase = phrase;
        this.date = date;
        this.punctuation = punctuation;
    }

    public Phrase() {
    }

    public String getPhrase() {
        return phrase;
    }

    public String getDate() {
        return date;
    }

    public int getPunctuation() {
        return punctuation;
    }

}
