/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    // Instance Data Fields
    private String position;
    private String bats;
    private String throwDirection;
    private int yearMLBDebut;
    private Club club;
    private int playerNumber = 28;

    //
    // Constructors
    //
    public Player() {
    }


    public Player(String position, String bats, String throwDirection, int yearMLBDebut, Club club,
                  int playerNumber) {
        this.position = position;
        this.bats = bats;
        this.throwDirection = throwDirection;
        this.yearMLBDebut = yearMLBDebut;
        this.club = club;
        this.playerNumber = playerNumber;
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

    //
    // @Override
    //
    @Override
    public String toString(){
        super.setFirstName("Buster");
        super.setLastName("Posey");
        return super.getFirstName() + " " + getLastName();
    }
    public String toStringPlayerInfo(String name){
        String tempString;
        tempString = "\n---"
                + "\nPlayer: \t" + name
                + "\nClub: \t\t" + this.club.getOfficialName()
                + "\nPosition: \t" + this.position
                + "\nNumber: \t" + this.playerNumber
                + "\nBats: \t\t" + this.bats
                + "\nThrows: \t" + this.throwDirection
                + "\nMLB Debut:  " + this.yearMLBDebut;
        return tempString;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getThrowDirection() {
        return throwDirection;
    }

    public void setThrowDirection(String throwDirection) {
        this.throwDirection = throwDirection;
    }

    public int getYearMLBDebut() {
        return yearMLBDebut;
    }

    public void setYearMLBDebut(int yearMLBDebut) {
        this.yearMLBDebut = yearMLBDebut;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    @Override
    public void sayGreeting() {
        super.sayGreeting();
    }

    @Override
    public void sayGreeting(String string) {

    }
}
