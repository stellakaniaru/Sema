package com.example.android.sema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> EnglishNumList = new ArrayList<Word>();

        EnglishNumList.add(new Word("Good morning?", "Habari ya asubuhi?"));
        EnglishNumList.add(new Word("Good afternoon?", "Habari ya mchana?"));
        EnglishNumList.add(new Word("Hello", "Jambo"));
        EnglishNumList.add(new Word("Welcome to Kenya.", "Karibu Kenya."));
        EnglishNumList.add(new Word("Good evening?", "Habari ya jioni?"));
        EnglishNumList.add(new Word("How was your day?", "Umeshidanje?"));
        EnglishNumList.add(new Word("How are you?", "Habari yako?"));
        EnglishNumList.add(new Word("Assist me with a glass of water.", "Nisaidie na glasi ya maji."));
        EnglishNumList.add(new Word("Come here.", "Kuja hapa."));
        EnglishNumList.add(new Word("Where are the washrooms?", "Msalani ni wapi?"));
        EnglishNumList.add(new Word("Thank you very much.", "Asante sana."));
        EnglishNumList.add(new Word("Welcome.", "Karibu."));

        WordAdapter adapter = new WordAdapter(this, EnglishNumList);
        ListView rootView = (ListView) findViewById(R.id.list);
        rootView.setAdapter(adapter);
    }
}
