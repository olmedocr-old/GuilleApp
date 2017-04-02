package com.example.raul.guilleapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by raul on 2/4/17.
 */

public class PhraseViewHolder extends RecyclerView.ViewHolder {

    TextView textViewPhrase, textViewDate, textViewPunctuation;

    public PhraseViewHolder(View itemView){
        super(itemView);
        bindViews(itemView);
    }

    private void bindViews(View itemView) {
        textViewPhrase = (TextView) itemView.findViewById(R.id.text_phrase);
        textViewDate = (TextView) itemView.findViewById(R.id.text_date);
        textViewPunctuation = (TextView) itemView.findViewById(R.id.text_punctuation);

    }

    public void bind(Phrase phrase) {
        textViewPhrase.setText(phrase.getPhrase());
        textViewDate.setText(phrase.getDate());
        textViewPunctuation.setText(phrase.getPunctuation());
    }
}
