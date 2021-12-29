package no.rubstubs;

public class Decode {
    static String decodeSpecific(int rot, String language, String ciphertext) {

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

        char[] cipherArray = (ciphertext.toLowerCase()).toCharArray(); // ciphertext to array
        int[] charNumber = new int[ciphertext.length()]; // ciphertext to number in array
        String plaintext = "";

        // Converting
        for (int i = 0; i < cipherArray.length; i++) {
            charNumber[i] = alphabet.indexOf(cipherArray[i]); //Setting alphabetic value of plaintext into an int array

            // Decide plaintext cipher value
            int decodedCharNumber;
            if (charNumber[i] - rot < 0) decodedCharNumber = alphabetArray.length + (charNumber[i] - rot);
            else decodedCharNumber = charNumber[i] - rot;

            char newDecodedChar = alphabetArray[decodedCharNumber]; // Convert plaintext cipher value to letter
            plaintext += newDecodedChar; // Put together plaintext
        }

        // Print
        System.out.println("\nDECODING ROT" + rot + "\n");
        System.out.println(" - CIPHERTEXT:  " + ciphertext.toUpperCase());
        System.out.println(" - PLAINTEXT:   " + plaintext);
        return plaintext;
    }

    static char[] decodeAll(String language, String ciphertext) {
        System.out.println("\nDECODING ALL ROTS FROM CIPHERTEXT: " + ciphertext + "\n"); // Print

        // Setting reference alphabet
        String alphabet = "";
        if (language.equals("nor")) alphabet = "abcdefghijklmnopqrstuvwxyzøæå"; // Norwegian
        else if (language.equals("eng")) alphabet = "abcdefghijklmnopqrstuvwxyz"; // English

        char[] alphabetArray = alphabet.toCharArray(); // Putting alphabet into char array
        char[] cipherArray = (ciphertext.toLowerCase()).toCharArray(); // ciphertext to array
        int[] charNumber = new int[ciphertext.length()]; // ciphertext to number in array

        // Converting
        for (int rot = 1; rot < alphabetArray.length; rot++) {
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
            System.out.println(" - PLAINTEXT ROT" + rot + ":\t" + plaintext); // Print
        }
        return alphabetArray;
    }
}
