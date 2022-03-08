/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Color.java
 * @author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ChatSession {

    //  Static Data Fields

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    //
    // Instance Data Fields
    //


    private String studentName;
    String firstName;
    private String lastName;
    private final Club club = new Club("San Francisco Giants", "SF Giants", "Farhan Zaidi", "Scott Harris", "Gabe Kapler", "Don't Stop Believin");
    private String clubPrompt = "SF GIANTS: ";
    private Player player = new Player("Catcher", "Right", "Right", 2009, club, 28);
    private String playerPrompt = new Player().toString()  + ", " + new Player().getPlayerNumber() + ": ";
    private Student student = new Student(firstName, lastName);
    private String studentPrompt;
    private String tmpString;
    private University university;
    private String studentEmail;
    private String recipientName;
    private char artSymbol;
    private String messageCard;
    private static String name = " ";

    String[] messages = {" Chat session started.", "\n" + this.clubPrompt + "Welcome to " + Config.getDefaultClub().toUpperCase() + "!",
            "\n" + this.clubPrompt + "Your first and last name, please: ", this.clubPrompt + "Your school email address, please: ",
            this.clubPrompt + "Thank you. Connecting with a SF Giants player", " Chat session ended.",
            "Hello " + name + "! C-O-N-G-R-A-T-U-L-A-T-I-O-N-S! ",
            ChatSession.ANSI_PURPLE_BACKGROUND + ChatSession.ANSI_YELLOW + Config.getDefaultUniversity().toUpperCase() + ANSI_RESET + ". Way to go!",
            "Likewise, " + name + ". Very nice chatting w/ you.", "How many SF Giants Thank You cards are you getting?",
            "In 3 lines, Please provide \n [1] Recipient name \n [2] Art symbol (a character) \n [3] Message to recipient", "Thanks, " + name + ". Your order: ",
            "Thanks again, " + name + ". See you at your graduation ceremony!", "\nFREE tickets to SF Giants games this summer! Ace this quiz:",
            "See you at the summer games!!!", "\n***FREE tickets to summer games!***", "Thank you!"};


    //
    // Constructors
    //

    public ChatSession(Club club, University university){
        club = club;
        this.university = university;
    }


    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    private void startChatSession() {

        Scanner input = new Scanner(System.in);
        Student student = new Student(studentName);
        ChatSession chatSession = new ChatSession(club, university);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        System.out.print(this.messages[1]);
        System.out.println(this.club.toString());
        System.out.print(this.messages[2]);
        studentName = input.nextLine();
        this.name=studentName;
        String[] arr = studentName.split(" ");
        studentPrompt = studentName + ": ";
        student.setFirstName(studentName);
        System.out.print(this.messages[3]);
        studentEmail = input.nextLine();
        System.out.println(name + ": " + "Welcome to my University!");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\n----------------------------------------------------------------------" +
                "\nOfficial Name: \t\t\t\t" + this.university.getOfficialName()
                + "\nMotto in Latin: \t\t\t" + this.university.getMottoL()
                + "\nMotto in English: \t\t\t" + this.university.getMottoE()
                + "\nType: \t\t\t\t\t\t" + this.university.getType()
                + "\nYear of Establishment: \t\t" + this.university.getYearOfEstablishment()
                + "\nAddress: \t\t\t\t\t" + this.university.getAddress()
                + "\nColors: \t\t\t\t\t" + this.university.getColors()
                + "\nNickname: \t\t\t\t\t" + this.university.getNickname()
                + "\nMascot: \t\t\t\t\t" + this.university.getMascot()
                + "\nWebsite: \t\t\t\t\t" + this.university.getWebsiteSFSU());

    }

    private void connectChatters() {
        String playername=" ";
        System.out.println("Press 0 to chat with Buster Posey, 1 for John Brebbia, 2 for Brenden Belt");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num==0)
        {
            playername="Buster Posey";
            this.player=new Player("Catcher", "Right", "Right", 2009, club, 28);
            player.setFirstName("Buster");
            player.setLastName("Posey");
            this.playerPrompt = player.getFirstName() + " " + player.getLastName()+  ", " + new Player().getPlayerNumber() + ": ";
        }else if(num==1){
            playername="John Brebbia";
            this.player=new Player("Pitcher", "Left", "Left", 2015, club, 59);
            player.setFirstName("John");
            player.setLastName("Brebbia");
            this.playerPrompt = player.getFirstName() + " " + player.getLastName()+  ", " + new Player().getPlayerNumber()+ ": ";
        }else if(num==2)
        {
            playername="Brenden Belt";
            this.player=new Player("Infielders", "Left", "Left", 2005, club, 9);
            player.setFirstName("Brendon");
            player.setLastName("Belt");
            this.playerPrompt = player.getFirstName() + " " + player.getLastName()+  ", " + new Player().getPlayerNumber()+ ": ";
        }


        System.out.println(this.messages[4]);
        int numDots = 10;
        for (int i = 1; i < numDots; i++) {
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChatSession.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (i == 4) {
                System.out.println(this.player.toStringPlayerInfo(playername));
            }
            System.out.print(" .");
        }
        System.out.println("");
    }


    private void chat() throws Exception {
        Scanner input = new Scanner(System.in);
        String chat1;

        System.out.println(this.playerPrompt + "Hello " + this.name + "! C-O-N-G-R-A-T-U-L-A-T-I-O-N-S! ");
        System.out.println(this.playerPrompt + this.messages[7]);
        System.out.print(this.studentPrompt);
        chat1 = input.nextLine();

        System.out.println(this.playerPrompt +  "Likewise, " + this.name + ". Very nice chatting w/ you.");

        int numCards=0;
        while(true) {
            Scanner input2= new Scanner(System.in);
            try {
                System.out.println(this.playerPrompt + this.messages[9]);
                System.out.print(this.studentPrompt);
                 numCards = input2.nextInt();
                 break;
            }catch(Exception e){
                System.out.println("Please enter a number only");
            }
        }
        this.tmpString = this.messages[10];
        for (int i = 1; i <= numCards; i++) {
            Scanner input1=new Scanner(System.in);
            this.tmpString = this.tmpString + "the Card #" + i + ", please:";
            System.out.println(this.playerPrompt + this.messages[10]);
// Recipient
            System.out.print(this.studentPrompt + "[1] ");
            recipientName = input1.nextLine();
// art symbol
            System.out.print(this.studentPrompt + "[2] ");
            artSymbol =  input1.nextLine().charAt(0);
// Message
            System.out.print(this.studentPrompt + "[3] ");
            messageCard = input1.nextLine();

            Card card = new Card(messageCard);
            SFGiantsCardGenerator.generateSFGiantsCard(recipientName, messageCard, studentName, studentEmail, artSymbol, 11, "Courier");

         }

        System.out.println(this.playerPrompt + "Thanks, " + this.name + ". Your order: ");
       // this.student.listCards();
// Student confirms
        System.out.print(this.studentPrompt);
// Player leaves
        System.out.println(this.playerPrompt +  "Thanks again, " + this.name + ". See you at your graduation ceremony!");
    }
    private void runQuiz() {
        System.out.println(this.messages[13]);
        new Quiz().makeDefaultQuiz(studentPrompt, clubPrompt);
        new Quiz().printQuiz();
        new Quiz().runQuiz(studentPrompt, clubPrompt);
    }
    private void stopChatSession() {
    }
    public void runChatSession() throws Exception {
        Language language = new Language("English");
        new Config().setLang(language);
        this.startChatSession();
        this.connectChatters();
        this.chat();
        this.runQuiz();
        this.stopChatSession();
    }

    public String[] getMessages() {
        return messages;
    }

    public Club getClub() {
        return club;
    }

    public String getClubPrompt() {
        return clubPrompt;
    }

    public Player getPlayer() {
        return player;
    }

    public String getPlayerPrompt() {
        return playerPrompt;
    }

    public Student getStudent() {
        return student;
    }

    public String getStudentPrompt() {
        return studentPrompt;
    }

    public void setStudentPrompt(String studentPrompt) {
        this.studentPrompt = studentPrompt;
    }

    public String getTmpString() {
        return tmpString;
    }

    public void setTmpString(String tmpString) {
        this.tmpString = tmpString;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
    //
    // Language
    //
}