package com.moodAnalyzer;

import org.junit.*;

public class moodAnalyzerTest {

    @Test
    public void messageReturnsSad() {
        String message = "I am feeling sad";
        moodAnalyzer mood = new moodAnalyzer(message) ;
        String message1 = mood.analyzeMood();
        Assert.assertEquals("Sad", message1);
    }

    @Test
    public void messageReturnHappy() {
        String message = "Today I am ain a good mood";
        moodAnalyzer mood = new moodAnalyzer(message);
        String message1 = mood.analyzeMood();
        Assert.assertEquals("Happy", message1);
    }
}
