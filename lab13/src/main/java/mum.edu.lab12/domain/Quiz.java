package mum.edu.lab12.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz {

    private List<String> questions = Arrays.asList("3,1,4,1,5", "1,1,2,3,5",
            "1,4,9,16,25", "2,3,5,7,11", "1,2,4,8,16");
    private int[] answers = {9, 8, 36, 13, 32};
    ArrayList<String> visitedQuestions = new ArrayList<>();
    public static int count = 0;
    String retrieveRandomQuestion;

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public int[] getAnswers() {
        return answers;
    }

    public void setAnswers(int[] answers) {
        this.answers = answers;
    }

    public ArrayList<String> getVisitedQuestions() {
        return visitedQuestions;
    }

    public void setVisitedQuestions(ArrayList<String> visitedQuestions) {
        this.visitedQuestions = visitedQuestions;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Quiz.count = count;
    }

    public String getRetrieveRandomQuestion() {
        return retrieveRandomQuestion;
    }

    public void setRetrieveRandomQuestion(String retrieveRandomQuestion) {
        this.retrieveRandomQuestion = retrieveRandomQuestion;
    }
}
