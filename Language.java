/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: Tushin Kulshreshtha
 * @partner: Riken Kapadia
 * **********************************************
 */


package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// java.util.ResourceBundle
// - ResourceBundle is a valid approach to internationalization.
// - ResourceBundle is not required.
// - Other approaches to internationalization are available. Some of these approaches are
// more straightforward and more relevant to new CSC 220 students then ResourceBundle is.
// - Yet, curiosity for intelligence is always highly encouraged:
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ResourceBundle.html

public final class Language {
    //
    // Static Data Fields
    //    
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default

    //
    // Instance Data Fields
    //
    private String[] GreetingPhrase = {"SF GIANTS: Welcome to SF Giants Card Generator", "ALien", "bsdk", "mdc", "BSDKJ"};
    private String[] clubPhrase = {"San Francisco Giants"};
    private String[] configPhrase = {"----------------------------------------------------------------------", "Language: ", "Time Zone:", "Color Sequence:", "Standard Output Log:",
            "Standard Error Log:", "Receipt Log:", "Default University:", "Default University:", "Default Club:"};
    private String[] universityPhrase = {"San Francisco State University"};
    private String language = "English";

    //
    // Constructors
    //
    public Language() {
    }
    public Language(String language) {
        this.language = language;
        switch (language.toLowerCase()) {
            case "alien" -> this.populateAlienPhrases();            // Supported
            case "chinese" -> this.populateChinesePhrases();        // Future implementation
            case "french" -> this.populateFrenchPhrases();          // Future implementation
            case "spanish" -> this.populateSpanishPhrases();        // Future implementation
            case "future" -> this.populateYourLanguagePhrases();    // Future implementation
            default -> this.populateEnglishPhrases();               // Supported
        }


    }

    private void populateYourLanguagePhrases() {
    }

    private void populateSpanishPhrases() {
    }

    private void populateFrenchPhrases() {
    }

    private void populateChinesePhrases() {
    }

    private void populateAlienPhrases() {
    }

    private void populateEnglishPhrases() {
        this.language = language;
    }

    public static void displayAppHeader() {
        System.out.println(Config.getOfficialAppHeader());
    }

    public static Language setLanguagePreference() {
        Language language = new Language("English");
        return language;
    }

    public String getGreetingPhrase(int i) {
        return GreetingPhrase[i];
    }

    public void setGreetingPhrase(String[] greetingPhrase) {
        GreetingPhrase = greetingPhrase;
    }


    public String getUniversityPhrase(int i) {
        return universityPhrase[i];
    }

    public void setUniversityPhrase(String[] universityPhrase) {
        this.universityPhrase = universityPhrase;
    }

    public String getConfigPhrase(int i) {
        return configPhrase[i];
    }

    public String getClubPhrase(int i) {
        return clubPhrase[i];
    }

    public Object getLanguage() {
        return Config.getDefaultLanguage();
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
    // Language
    //
}