package com.alexis.interview.dictionary;

import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Dictionary {

    private String name;

 //   private HashMap<String,String> translations = new HashMap<>();
    private Multimap<String, String> translations = TreeMultimap.create();

    public Dictionary(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isEmpty() {
        return translations.isEmpty();
    }

    public void addTranslation(String wordInEnglish, String wordInFrench){
        translations.put(wordInEnglish, wordInFrench);
    }

    public Collection<String> getMultipleTranslations(String wordInEnglish){
        return translations.get(wordInEnglish);
    }


}
