package com.example.quizer.models;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<Answer> answers;
    private int rightAnswerIndex;

    public Question() {
        answers = new ArrayList<>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    private Question addAnswer(Answer answer) throws Exception {
        if (answers.contains(answer))
            throw new Exception("Ilegal operation, can't insert identical answers");
        answers.add(answer);
        return this;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Question){
            return this.question.equals(((Question) other).getQuestion());
        }
        return false;
    }

}
