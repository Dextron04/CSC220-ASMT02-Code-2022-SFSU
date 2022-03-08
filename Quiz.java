/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.*;

public final class Quiz {
    private final ArrayList<QuestionAnswer> questionAnswer;
    private String studentPrompt;
    private String clubPrompt;
    private int allCorrect;

    public Quiz() {
        this.questionAnswer = new ArrayList();

    }
    public void makeDefaultQuiz(String studentPrompt, String clubPrompt) {
        this.studentPrompt = studentPrompt;
        this.clubPrompt = clubPrompt;
        this.questionAnswer.add(new QuestionAnswer(
                "Which type of class has 'protected' constructors?",
                "Abstract"));
        this.questionAnswer.add(new QuestionAnswer(
                "What type of method did Java 8 add to Interface?",
                "Default"));
        this.questionAnswer.add(new QuestionAnswer(
                "What new keyword did Java 13 add to 'switch' statement?",
                "Yield"));
        this.questionAnswer.add(new QuestionAnswer(
                "In java 15 what keyword pairs with sealed?",
                "Permits"));
        this.questionAnswer.add(new QuestionAnswer(
                "Giants in Spanish?",
                "Gigantes"));
        this.questionAnswer.add(new QuestionAnswer(
                "Take me out to the ...?",
                "Ball Game"));
    }

    public void printQuiz() {
        for (int i = 0; i < this.questionAnswer.size(); i++) {
            System.out.println(this.questionAnswer.get(i).getQuestion());
            System.out.println(this.questionAnswer.get(i).getAnswer());
            System.out.println();
        }
    }

    public void runQuiz(String studentPrompt, String clubPrompt) {
        String[] ans = new String[6];
        Scanner input = new Scanner(System.in);
        int correctAns = 0;
                                 //0
        String[] question = {"Which type of class has 'protected' constructors?",
                //1
                "What type of method did Java 8 add to Interface?",
                //2
                "What new keyword did Java 13 add to 'switch' statement?",
                //3
                "In java 15, what keyword pairs with Sealed?",
                //4
                "Giants in Spanish?",
                 //5
                  " Take me out to the.....?"};

        String[] answers = {"Abstract".toLowerCase(),
                "Default".toLowerCase(),
                "Yield".toLowerCase(),
                "Permits".toLowerCase(),
                "Gigantes".toLowerCase(),
                "Ball Game".toLowerCase()};

        try{
            System.out.println(clubPrompt + ": " + question[0]);
            System.out.print(studentPrompt);
            ans[0] = input.nextLine();
            if(ans[0].toLowerCase().equals(answers[0])){
                System.out.println("Correct!");
                correctAns++;
            } else{
                System.out.println("Oops...");
            }

            System.out.println(clubPrompt + ": " + question[1]);
            System.out.print(studentPrompt);
            ans[1] = input.nextLine();
            if(ans[1].toLowerCase().equals(answers[1])){
                System.out.println("Correct!");
                correctAns++;
            } else{
                System.out.println("Oops...");
            }

            System.out.println(clubPrompt + ": " + question[2]);
            System.out.print(studentPrompt);
            ans[2] = input.nextLine();
            if(ans[2].toLowerCase().equals(answers[2])){
                System.out.println("Correct!");
                correctAns++;
            } else{
                System.out.println("Oops...");
            }

            System.out.println(clubPrompt + ": " + question[3]);
            System.out.print(studentPrompt);
            ans[3] = input.nextLine();
            if(ans[3].toLowerCase().equals(answers[3])){
                System.out.println("Correct!");
                correctAns++;
            } else{
                System.out.println("Oops...");
            }
            System.out.println(clubPrompt + ": " + question[4]);
            System.out.print(studentPrompt);
            ans[4] = input.nextLine();
            if(ans[4].toLowerCase().equals(answers[4])){
                System.out.println("Correct!");
                correctAns++;
            } else{
                System.out.println("Oops...");
            }
            System.out.println(clubPrompt + ": " + question[5]);
            System.out.print(studentPrompt);
            ans[5] = input.nextLine();
            if(ans[5].toLowerCase().equals(answers[5])){
                System.out.println("Correct!");
                correctAns++;
            } else{
                System.out.println("Oops...");
            }

        } catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }

        if(correctAns > 3){
            System.out.println("*** Congrats! You won FREE TICKETS to SF GIANTS Games ***");
            System.out.println(new Timer().getTimeZoneFormatted() + ": " +  new Timer().dateFormat.format(new Date()));
        } else{
            System.out.println("____ Please try again at your graduation ceremony. ____");
            System.out.println(new Timer().getTimeZoneFormatted() + ": " +  new Timer().dateFormat.format(new Date()));
        }



    }
    public void setNumOfQuestionsMissed(int allCorrect) {
        this.allCorrect = allCorrect;
    }

    public int getNumOfQuestionsMissed() {
        return allCorrect;
    }

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Quiz(ArrayList<QuestionAnswer> questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}