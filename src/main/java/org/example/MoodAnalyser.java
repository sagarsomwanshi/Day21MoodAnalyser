package org.example;

public class MoodAnalyser {
    String  mood;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String mood) {
        this.mood = mood;
    }
    public String analyseMood(){
        if(mood.contains("SAD")){
            return "SAD";
        }else {
            return "HAPPY";
        }

    }

}
