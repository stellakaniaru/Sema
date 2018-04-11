package com.example.android.sema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> EnglishNumList = new ArrayList<Word>();

        EnglishNumList.add(new Word("Red", "Nyekundu"));
        EnglishNumList.add(new Word("Black", "Nyeusi"));
        EnglishNumList.add(new Word("Green", "Kijani Kibichi"));
        EnglishNumList.add(new Word("Blue", "Samawati"));
        EnglishNumList.add(new Word("Brown", "Hudhurungi"));
        EnglishNumList.add(new Word("Yellow", "Manjano"));
        EnglishNumList.add(new Word("Orange", "Chenza"));
        EnglishNumList.add(new Word("Purple", "Zambarau"));
        EnglishNumList.add(new Word("Pink", "Waridi"));
        EnglishNumList.add(new Word("White", "Nyeupe"));

        WordAdapter adapter = new WordAdapter(this, EnglishNumList);
        ListView rootView = (ListView) findViewById(R.id.list);
        rootView.setAdapter(adapter);
    }
}
