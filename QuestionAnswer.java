/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: QuestionAnswer.java
 * Author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class QuestionAnswer {
    private String question;
    private String answer;

    public QuestionAnswer() {

    }

    public QuestionAnswer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // using setters and getters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return this.question + "\n" + this.answer;
    }

    //
    // Instance Data Fields
    //

    //
    // Constructors


    //
    // Instance Method
    //

    //
    // Language
    //

    //
    // Override
    //
}