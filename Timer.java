/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Timer {

    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

    //
    // Static Data Fields
    //
    private String timeZone = "Pacific Standard Time";



    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Timer(String timeZone){
        this.timeZone = timeZone;
    }
    public Timer() {
    }

    public static Timer setTimeZonePreference() {
        Timer timer = new Timer("Pacific Standard Time");
        return timer;
    }


    public String getTimeZoneFormatted() {
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        return timeZone;
    }

    //
    // Static Methods
    //

    //
    // Additional Static Methods
    //

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