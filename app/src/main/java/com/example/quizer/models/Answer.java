package com.example.quizer.models;

public class Answer {
    private String answer;

    public Answer() { }

    public Answer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Answer){
            return this.answer.equals(((Answer) other).getAnswer());
        }
        return false;
    }

}
