package com.company;

import java.util.Scanner;

public class TrueOrFalse extends Question{
    private String answer;

    public TrueOrFalse(String answer, String textQuestion){
        super(textQuestion);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean checkAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 't' for true and 'f' for false: ");
        String userAnswer = input.nextLine();
        if(this.answer.equals(userAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Incorrect");
        return false;
    }

    @Override
    public void displayAnswers() {
        System.out.println("The correct answer is: " + this.answer);

    }
}
