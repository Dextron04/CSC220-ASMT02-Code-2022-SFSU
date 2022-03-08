/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Card {

    //
    // Instance Data Fields
    //
    private int artSize = 18;     // Please change artSize, if needed, to get an identical output
    private String artFont = "Courier"; // Please change artFont, if needed, to get an identical output
    private String cardReceipt;
    private String cardMessage;
    private Student student;
    private String name;

    //
    // Constructors
    //


    @Override
    public String toString() {
        String returnString;
        returnString = "From: " + this.student + "\t Receipt: " +
                this.cardReceipt + "\t Message: " + this.cardMessage;
        return returnString;
    }

    public Card() {
    }
    public Card(String cardMessage){
        this.cardMessage = cardMessage;
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
