package com.company;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {
	// write your code here
    TrueOrFalse question1 = new TrueOrFalse("t", "A circle is round-ish.");
    ArrayList<String> q2PossibleAnswers = new ArrayList<>();
    q2PossibleAnswers.add("Wildcat");
    q2PossibleAnswers.add("Jayhawk");
    q2PossibleAnswers.add("Lion");
    q2PossibleAnswers.add("Bear");


    MultipleChoice question2 = new MultipleChoice("Jayhawk", q2PossibleAnswers, "What is KU's mascot?");

    Quiz newQuiz = new Quiz();
    newQuiz.addQuestion(question1);
    newQuiz.addQuestion(question2);
    newQuiz.runQuiz();
    }
}
