package com.example.raul.guilleapp;

import java.util.Date;

/**
 * Created by raul on 2/4/17.
 */

public class Phrase {
    private String phrase, date, punctuation;

    public Phrase(String date, String phrase, String punctuation) {
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

    public String getPunctuation() {
        return punctuation;
    }

}
