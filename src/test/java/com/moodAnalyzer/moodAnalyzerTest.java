package com.moodAnalyzer;

import org.junit.*;

public class moodAnalyzerTest {

    @Test
    public void messageReturnsSad() {
        String sentence = "I am feeling sad";
        moodAnalyzer mood = new moodAnalyzer(sentence) ;
        String sentence1 = mood.analyzeMood();
        Assert.assertEquals("Sad", sentence1);
    }

    @Test
    public void messageReturnHappy() {
        String sentence = "Today I am ain a good mood";
        moodAnalyzer mood = new moodAnalyzer(sentence);
        String sentence1 = mood.analyzeMood();
        Assert.assertEquals("Happy", sentence1);
    }
}
