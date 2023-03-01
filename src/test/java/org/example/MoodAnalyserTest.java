package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void MoodIsSad(){
        MoodAnalyser mood = new MoodAnalyser();
        assertEquals("SAD", mood.analyseMood("I am SAD"));
    }
    @Test
    public void MoodIsHappy(){
        MoodAnalyser mood = new MoodAnalyser();
        assertEquals("HAPPY", mood.analyseMood("I am in Any mood"));
    }
}