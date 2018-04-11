package com.example.android.sema;

/**
 * Created by user on 4/6/2018.
 */

public class Word {
    private String mDefaultTranslation;

    private String mSwahiliTranslation;

    public Word(String DefaultTranslation, String SwahiliTranslation){
        mDefaultTranslation = DefaultTranslation;
        mSwahiliTranslation = SwahiliTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public  String getSwahiliTranslation(){
        return mSwahiliTranslation;
    }
}
