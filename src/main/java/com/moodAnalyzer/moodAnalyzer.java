package com.moodAnalyzer;

public class moodAnalyzer {
    private final String message ;

    public moodAnalyzer(String message) {
        this.message = message ;
    }

    public String analyzeMood() {
        if(message.contains("sad")){
            return "Sad";
        }
        else {
            return "Happy";
        }
    }

}
