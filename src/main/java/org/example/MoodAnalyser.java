package org.example;

public class MoodAnalyser {
    private String  mood;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String mood) {
        this.mood = mood;
    }
    public String analyseMood(){
        try {
            if(mood.contains("SAD")) {
                return "SAD";
            }
            if(mood.contains("HAPPY")){
                return "HAPPY";
            }
            if(mood.length() == 0){
                throw new NullPointerException("HAPPY");
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }
        return "Invalid Mood";
    }

}
