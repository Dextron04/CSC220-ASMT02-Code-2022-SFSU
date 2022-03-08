/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
import java.util.ArrayList;
import java.util.Arrays;

public final class Club extends Organization {


    //
    // Instance Data Fields
    //
    private String OfficialName = Config.getDefaultClub();
    private String shortName = "SF GIANTS";
    private String president = new President().getName();
    private String generalManager = new GeneralManager().getName();
    private String manager = new Manager().getName();
    private static String officialSong = "Don't Stop Believin";
    private String clubPhrase = Config.getDefaultClub();


    //
    // Constructors
    //
    public Club() {
    }

    public Club(String officialName, String shortName, String president,
                String generalManager, String manager, String officialSong) {
        Club.officialSong = officialSong;
        OfficialName = officialName;
        this.shortName = shortName;
        this.president = president;
        this.generalManager = generalManager;
        this.manager = manager;
    }

    public Club(String defaultClub) {
        defaultClub = OfficialName;
    }


    @Override
    public void displayAbout() {

    }

    @Override
    public void displayMission() {

    }

    //
    // Static Methods
    //

    //
    // Instance Methods
    //
    @Override
    public String toString(){
        String tempString;
        tempString = "\n----------------------------------------------------------------------" +
                 "\nClub: \t\t\t\t" + this.OfficialName
                + "\nShort Name: \t\t" + this.shortName
                + "\nPresident: \t\t\t" + this.president
                + "\nGeneral Manager: \t" + this.generalManager
                + "\nManager: \t\t\t" + this.manager
                + "\n----------------------------------------------------------------------";
        return tempString;
    }

    public String getClubPhrase() {
        return clubPhrase;
    }

    public void setClubPhrase(String clubPhrase) {
        this.clubPhrase = clubPhrase;
    }

    public String getOfficialName() {
        return OfficialName;
    }

    public void setOfficialName(String officialName) {
        OfficialName = officialName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getGeneralManager() {
        return generalManager;
    }

    public void setGeneralManager(String generalManager) {
        this.generalManager = generalManager;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public static String getOfficialSong() {
        return officialSong;
    }

    public void setOfficialSong(String officialSong) {
        Club.officialSong = officialSong;
    }
    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}