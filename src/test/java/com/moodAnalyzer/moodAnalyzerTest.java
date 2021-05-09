package com.moodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessageReturnHappy() {
        moodAnalyser mood = new moodAnalyser(null);

        try {
            mood.analyseMood();
        }
        catch(MoodAnalysisException e){
            Assert.assertEquals("Please Enter a right input", e.getMessage());
        }
    }
}
