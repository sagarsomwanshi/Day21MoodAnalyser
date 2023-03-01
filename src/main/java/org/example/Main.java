package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Mood");
        Scanner sc = new Scanner(System.in);
        String mood  = sc.nextLine();
        MoodAnalyser Obj = new MoodAnalyser();
        System.out.println(Obj.analyseMood(mood));
    }
}