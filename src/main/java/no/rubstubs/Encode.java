package no.rubstubs;

public class Encode {
    static String encodeSpecific(int rot, String language, String plaintext) {

        // Setting reference alphabet
        String alphabet;
        if (language.equals("nor")) alphabet = "abcdefghijklmnopqrstuvwxyzøæå"; // norwegian
        else if (language.equals("eng")) alphabet = "abcdefghijklmnopqrstuvwxyz"; // english
        else {
            System.out.println("NOT A VALID LANGUAGE");
            return null;
        }

        char[] alphabetArray = alphabet.toCharArray(); // Putting alphabet into char array

        // Handling user error in rot format selection
        if (rot < 1 || rot > (alphabetArray.length-1)) {
            System.out.println("\nERROR: CHOOSE A ROT FORMAT BETWEEN 1 AND " + (alphabetArray.length-1) + "!");
            return null;
        }

        char[] plaintextArray = (plaintext.toLowerCase()).toCharArray(); // plaintext to array
        int[] charNumber = new int[plaintext.length()]; // ciphertext to number in array

        // Converting
        String ciphertext = "";
        for (int i = 0; i < plaintextArray.length; i++) {
            charNumber[i] = alphabet.indexOf(plaintextArray[i]); //Setting alphabetic value of plaintext into an int array

            // Decide ROT cipher value
            int encodedCharNumber;
            if (charNumber[i] + rot > alphabetArray.length-1) encodedCharNumber = (charNumber[i] + rot) - alphabetArray.length;
            else encodedCharNumber = (charNumber[i] + rot);

            char newEncodedChar = alphabetArray[encodedCharNumber]; // Converting ROT cipher value to letter

            ciphertext += newEncodedChar; // Put together cipher text
        }
        // Print
        System.out.println("\nENCODING ROT" + rot + "\n");
        System.out.println(" - PLAINTEXT:   " + plaintext);
        System.out.println(" - CIPHERTEXT:  " + ciphertext.toUpperCase());
        return ciphertext.toUpperCase();
    }
}
