package com.example.android.sema;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 4/6/2018.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Activity context, ArrayList<Word> EnglishNumList){
        super(context, 0, EnglishNumList);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentArrayPosition = getItem(position);

        TextView swahiliWord = (TextView) listItemView.findViewById(R.id.swahili_word);
        swahiliWord.setText(currentArrayPosition.getSwahiliTranslation());

        TextView defaultWord = (TextView) listItemView.findViewById(R.id.default_word);
        defaultWord.setText(currentArrayPosition.getDefaultTranslation());




        return listItemView;
    }
}
