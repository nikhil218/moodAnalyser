package com.moodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givesExceptionIfEnteredNull() {
        moodAnalyser mood = new moodAnalyser(null);
        try {
            mood.analyseMood();
        }
        catch(MoodAnalyserException e){
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givesExceptionIfEnteredEmpty() {
        moodAnalyser mood = new moodAnalyser(" ");

        try{
            mood.analyseMood();
        }
        catch (MoodAnalyserException e){
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}