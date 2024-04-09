package com.example.hotel_app.rest;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage {

    public static String[] getWelcomeMessage() {

        String[] messages = new String[2];

        ResourceBundle englishBundle = ResourceBundle.getBundle("translation_en_US", Locale.ENGLISH);
        messages[0] = englishBundle.getString("welcomeMessage");


        ResourceBundle frenchBundle = ResourceBundle.getBundle("translation_fr_CA", Locale.FRENCH);
        messages[1] = frenchBundle.getString("welcomeMessage");

        return messages;
    }
}
