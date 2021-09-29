package com.company;

public abstract class Question {
    private String textQuestion;

    public Question(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public void displayQuestions() {
        System.out.println(this.textQuestion);
    }

    public abstract boolean checkAnswer();
    public abstract void displayAnswers();

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }
}
