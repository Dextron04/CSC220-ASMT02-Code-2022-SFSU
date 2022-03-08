/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.IOException;
import java.io.OutputStream;

public class StdOutStdErrTee extends OutputStream {
    @Override
    public void write(int b) throws IOException {

    }



    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //
    private final String logFilePath = Config.getDefaultStdOutFilePath();

    //
    // Constructors
    //

    //
    // Instance Methods
    //
    public void startLog() {
    }

    public void stopLog() {

    }

    public Object getStdOutFilePath() {
        return Config.getDefaultStdOutFilePath();
    }
    public Object getStdErrFilePath(){
        return Config.getDefaultStdErrFilePath();
    }


    //
    // Additional Methods
    //

    //
    // Language
    //

    //
    // Override
    //
}