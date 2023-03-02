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
                return "mood is Sad";
            }
            if(mood.contains("HAPPY")){
                return "Mood is Happy";
            }
            if(mood.length() == 0){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,"Please Enter Mood");
            }
        }catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Mood cannot be Null");
        }
        return "Invalid Mood";
    }

}
