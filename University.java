/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class University extends Organization {
    //
    // Static Data Fields
    //


    //
    // Instance Data Fields
    //
    private String officialName = Config.getDefaultUniversity();
    private String[] universityPhrase = {"San Francisco State University", "Experience Teaches", "Experientia Docet"};
    private String type = "Public";
    private int yearOfEstablishment = 1899;
    private String location = "San Francisco, California, United States";
    private String address = "1600 Holloway Avenue, San Francisco, CA, 94132";
    private String colors = "purple, gold";
    private String mascot = "Gator";
    private String nickname = "Gators";
    private String mottoE = "Experience Teaches";
    private String mottoL = "Experientia Docet";
    private String websiteSFSU = "www.sfsu.edu";

    //
    // Constructors
    //

    public University() {
    }

    public University(String name, String address, String officialName, String[] universityPhrase, String type,
                      int yearOfEstablishment, String location,
                      String address1, String colors, String mascot, String nickname, String mottoL, String mottoE,
                      String websiteSFSU) {
        super(name, address);
        this.officialName = officialName;
        this.universityPhrase = universityPhrase;
        this.type = type;
        this.yearOfEstablishment = yearOfEstablishment;
        this.location = location;
        this.address = address1;
        this.colors = colors;
        this.mascot = mascot;
        this.nickname = nickname;
        this.mottoE = mottoE;
        this.mottoL = mottoL;
        this.websiteSFSU = websiteSFSU;
    }

    public University(String defaultUniversity) {
        defaultUniversity = officialName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String[] getUniversityPhrase() {
        return universityPhrase;
    }

    public void setUniversityPhrase(String[] universityPhrase) {
        this.universityPhrase = universityPhrase;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMottoE() {
        return mottoE;
    }

    public void setMottoE(String mottoE) {
        this.mottoE = mottoE;
    }

    public String getMottoL() {
        return mottoL;
    }

    public void setMottoL(String mottoL) {
        this.mottoL = mottoL;
    }

    public String getWebsiteSFSU() {
        return websiteSFSU;
    }

    public void setWebsiteSFSU(String websiteSFSU) {
        this.websiteSFSU = websiteSFSU;
    }
    //
    // Instance Methods
    //

    //
    // Additional Methods
    //

    //
    // Language
    //

    //
    // Override
    //
    @Override
    public void displayAbout() {

    }

    @Override
    public void displayMission() {

    }
}