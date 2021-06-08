package com.bridgelabz.hashtabletest;

import com.bridgelabz.hashtable.MyHashMap;
import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    @Test
    public void givenSentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashmap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myHashmap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashmap.add(word, value);
        }
        int frequency = myHashmap.get("to");
        Assert.assertEquals(2,frequency);
    }

}