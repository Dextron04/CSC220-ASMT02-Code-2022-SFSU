/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: President.java
 * Author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class President extends Person {

    //
    // Instance Data Fields
    //
    private String name = "Farhan Zaidi";
    private String firstName = "Farhan";
    private String lastName = "Zaidi";

    //
    // Constructors
    //
    public President() {
    }

    public String getName() {
        return name;
    }

    public President(String name) {
        this.name = name;
    }

    public President(String firstName, String lastName, String name) {
        super(firstName, lastName);
        this.name = name;
    }
    //
    // Instance Methods
    //

    //
    // Language
    //

    //
    // Override
    //
    @Override
    public void sayGreeting() {
        super.sayGreeting();
    }

    @Override
    public void sayGreeting(String string) {

    }
}
