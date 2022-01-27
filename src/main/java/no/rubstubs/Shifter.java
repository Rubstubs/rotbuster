package no.rubstubs;

import java.util.ArrayList;

public class Shifter {
    public static ArrayList<String> getAllShifts(String ciphertext) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] alphabetArray = alphabet.toCharArray(); // Putting alphabet into char array
        char[] cipherArray = (ciphertext.toLowerCase()).toCharArray(); // ciphertext to array
        int[] charNumber = new int[ciphertext.length()]; // ciphertext to number in array
        ArrayList<String> allDecoded = new ArrayList<>();

        // Converting
        for (int rot = 0; rot < alphabetArray.length; rot++) {
            String plaintext = "";
            for (int i = 0; i < cipherArray.length; i++) {
                charNumber[i] = alphabet.indexOf(cipherArray[i]); // Setting alphabetic value of plaintext into an int array

                // Decide plaintext cipher value
                int decodedCharNumber;
                if (charNumber[i] - rot < 0) decodedCharNumber = alphabetArray.length + (charNumber[i] - rot);
                else decodedCharNumber = charNumber[i] - rot;

                char newDecodedChar = alphabetArray[decodedCharNumber]; // Convert plaintext cipher value to letter
                plaintext += newDecodedChar; // Put together plaintext
            }
            allDecoded.add(plaintext);
        }
        return allDecoded;
    }
}
