package com.example.android.sema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> EnglishNumList = new ArrayList<Word>();

        EnglishNumList.add(new Word("One", "Moja"));
        EnglishNumList.add(new Word("Two", "Mbili"));
        EnglishNumList.add(new Word("Three", "Tatu"));
        EnglishNumList.add(new Word("Four", "Nne"));
        EnglishNumList.add(new Word("Five", "Tano"));
        EnglishNumList.add(new Word("Six", "Sita"));
        EnglishNumList.add(new Word("Seven", "Saba"));
        EnglishNumList.add(new Word("Eight", "Nane"));
        EnglishNumList.add(new Word("Nine", "Tisa"));
        EnglishNumList.add(new Word("Ten", "Kumi"));

        WordAdapter adapter = new WordAdapter(this, EnglishNumList);
        ListView rootView = (ListView) findViewById(R.id.list);
        rootView.setAdapter(adapter);


    }
}
