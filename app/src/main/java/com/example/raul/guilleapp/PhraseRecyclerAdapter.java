package com.example.raul.guilleapp;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * Created by raul on 2/4/17.
 */

public class PhraseRecyclerAdapter extends RecyclerView.Adapter<PhraseViewHolder> {

    List<Phrase> phrases;

    public PhraseRecyclerAdapter(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    @Override
    public PhraseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("GuilleApp", "Create ViewHolder");
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_card_phrase, parent, false);
        return new PhraseViewHolder(row);
    }

    @Override
    public void onBindViewHolder(PhraseViewHolder holder, int position) {
        Log.i("GuilleApp", "Bind ViewHolder" + position);

        Phrase phrase = phrases.get(position);
        holder.bind(phrase);
    }

    @Override
    public int getItemCount() {
        return phrases.size();
    }
}
