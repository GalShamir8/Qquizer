package com.example.quizer.controllers;

import com.example.quizer.models.Quiz;

import java.util.UUID;

public class QuizBuilder {
    private Quiz quiz;

    public QuizBuilder(Quiz quiz) {
        this.quiz = quiz;
    }

    public String generateQuizPin(){
        return UUID.randomUUID().toString();
    }
}
