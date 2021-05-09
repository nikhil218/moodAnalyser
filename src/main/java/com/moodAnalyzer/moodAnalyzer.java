package com.moodAnalyzer;

public class moodAnalyser {
    private String message;

    public moodAnalyser(String message)
    {
        this.message=message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch(NullPointerException e){
            throw new MoodAnalysisException("Please Enter a right input");
        }
    }
}
