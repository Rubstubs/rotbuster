package no.rubstubs;

public class Encode {
    static String encodeSpecific(int rot, String plaintext) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] alphabetArray = alphabet.toCharArray(); // Putting alphabet into char array

        // Handling user error in rot format selection
        if (rot < 1 || rot > (alphabetArray.length-1)) {
            PrintToScreen.wrongRotAmt(alphabet);
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
        PrintToScreen.printEncoded(rot, plaintext, ciphertext);

        return ciphertext.toUpperCase();
    }
}
