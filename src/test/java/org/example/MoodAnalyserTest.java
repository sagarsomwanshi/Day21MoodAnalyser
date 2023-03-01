package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void MoodIsSad(){
        MoodAnalyser mood = new MoodAnalyser("I am SAD");
        assertEquals("SAD", mood.analyseMood());
    }
    @Test
    public void MoodIsHappy(){
        MoodAnalyser mood = new MoodAnalyser("I am in Any mood");
        assertEquals("HAPPY", mood.analyseMood());
    }
}