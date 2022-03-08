/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Manager.java
 * Author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Manager extends Person {

    //
    // Instance Data Fields
    //
    private String name = "Gabe Kapler";

    //
    // Constructors
    //

    public Manager(String name) {
        this.name = name;
    }


    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
    public void sayGreeting(String string) {

    }

    @Override
    public void sayGreeting() {
        super.sayGreeting();
    }
}