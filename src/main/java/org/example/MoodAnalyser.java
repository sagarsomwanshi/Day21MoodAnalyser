package org.example;

public class MoodAnalyser {
    public String analyseMood(String  mood){
        if(mood.contains("SAD")){
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
}
