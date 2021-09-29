package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Question {
    private ArrayList<String> answer;
    private ArrayList<String> possibleAnswers;

    public CheckBox(String textQuestion, ArrayList<String> answer, ArrayList<String> possibleAnswers) {
        super(textQuestion);
        this.answer = answer;
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public boolean checkAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the index of the correct answers: (press enter on blank line to exit)");
        ArrayList<String> userAnswers = new ArrayList<>();

        for(int i=0; i < this.possibleAnswers.size(); i++) {
            System.out.println(i + ": " + this.possibleAnswers.get(i));
        }
        boolean hasMoreAnswers = true;

        while (hasMoreAnswers) {
            String oneNum = input.nextLine();
            if (oneNum.equals("")) {
                hasMoreAnswers = false;
            } else {
                int indexNum = Integer.parseInt(oneNum);
                if(!userAnswers.contains(possibleAnswers.get(indexNum))) {
                    userAnswers.add((possibleAnswers.get(indexNum)));
                }
            }
        }
        if (userAnswers.size() != this.answer.size()) {
            System.out.println("Incorrect!");
            return false;
        } else {
            int correctAnswerNum = 0;
            for(String oneAnswer : userAnswers) {
                if (answer.contains(oneAnswer)) {
                    correctAnswerNum++;
                }
            }
            if (correctAnswerNum == this.answer.size()) {
                System.out.println("Correct!");
                return true;
            }
        }
        System.out.println("Incorrect!");
        return false;
    }

    @Override
    public void displayAnswers() {
        String result = "";
        for (String answers : this.answer) {
            if (result.length() == 0) {
                result = "The correct answers are: " + answers;
            } else {
                result = result + ", " + answers;
            }
        }
        System.out.println(result);
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
}
