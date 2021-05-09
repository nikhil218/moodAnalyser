package com.moodAnalyzer;

public class moodAnalyzer {
    private final String sentence ;

    public moodAnalyzer(String sentence) {
        this.sentence = sentence ;
    }

    public String analyzeMood() {
        if(sentence.contains("sad")){
            return "Sad";
        }
        else {
            return "Happy";
        }
    }

}
