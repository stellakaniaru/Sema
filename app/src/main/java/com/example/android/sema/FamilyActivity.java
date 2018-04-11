package com.example.android.sema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> EnglishNumList = new ArrayList<Word>();

        EnglishNumList.add(new Word("Father", "Baba"));
        EnglishNumList.add(new Word("Mother", "Mama"));
        EnglishNumList.add(new Word("Brother", "Kaka"));
        EnglishNumList.add(new Word("Sister", "Dada"));
        EnglishNumList.add(new Word("Baby", "Mtoto"));
        EnglishNumList.add(new Word("Aunt", "Shangazi"));
        EnglishNumList.add(new Word("Uncle", "Amu"));
        EnglishNumList.add(new Word("Cousin", "Binamu"));
        EnglishNumList.add(new Word("Grandfather", "Babu"));
        EnglishNumList.add(new Word("Grandmother", "Nyana"));

        WordAdapter adapter = new WordAdapter(this, EnglishNumList);
        ListView rootView = (ListView) findViewById(R.id.list);
        rootView.setAdapter(adapter);
    }
}
