public class Decode {
    static void decodeSpecific(int rot, String language, String ciphertext) {

        // Rett alfabet blir satt som referansealfabet
        String alphabet;
        if (language.equals("nor")) alphabet = "abcdefghijklmnopqrstuvwxyzøæå"; // referansealfabet
         else if (language.equals("eng")) alphabet = "abcdefghijklmnopqrstuvwxyz"; // referansealfabet
         else {
            System.out.println("NOT A VALID LANGUAGE");
            return;
        }

        char[] alphabetArray = alphabet.toCharArray(); // alfabetet nummereres

        // Handling user error in rot format selection
        if (rot < 1 || rot > (alphabetArray.length-1)) {
            System.out.println("\nERROR: CHOOSE A ROT FORMAT BETWEEN 1 AND " + (alphabetArray.length-1) + "!");
            return;
        }

        char[] cipherArray = (ciphertext.toLowerCase()).toCharArray(); // ciphertext til array
        int[] charNumber = new int[ciphertext.length()]; // ciphertext til nummer i array
        String plaintext = "";

        // Konvertering
        for (int i = 0; i < cipherArray.length; i++) {
            charNumber[i] = alphabet.indexOf(cipherArray[i]); // Setter alfabetisk verdi av plaintext inn i int array

            // Bestemmer plaintext-siffer-verdien
            int decodedCharNumber;
            if (charNumber[i] - rot < 0) decodedCharNumber = alphabetArray.length + (charNumber[i] - rot);
            else decodedCharNumber = charNumber[i] - rot;

            char newDecodedChar = alphabetArray[decodedCharNumber]; // Konverterer plaintext-siffer-verdien til bokstav
            plaintext += newDecodedChar; // Setter sammen plaintext
        }

        // Print
        System.out.println("\nDECODING ROT" + rot + "\n");
        System.out.println(" - CIPHERTEXT:  " + ciphertext.toUpperCase());
        System.out.println(" - PLAINTEXT:   " + plaintext);
    }

    static void decodeAll(String language, String ciphertext) {
        System.out.println("\nDECODING ALL ROTS FROM CIPHERTEXT: " + ciphertext + "\n"); // Print

        // Rett alfabet blir satt som referansealfabet
        String alphabet = "";
        if (language.equals("nor")) alphabet = "abcdefghijklmnopqrstuvwxyzøæå"; // referansealfabet
        else if (language.equals("eng")) alphabet = "abcdefghijklmnopqrstuvwxyz"; // referansealfabet

        char[] alphabetArray = alphabet.toCharArray(); // alfabetet nummereres
        char[] cipherArray = (ciphertext.toLowerCase()).toCharArray(); // ciphertext til array
        int[] charNumber = new int[ciphertext.length()]; // ciphertext til nummer i array

        // Konvertering
        for (int rot = 1; rot < alphabetArray.length; rot++) {
            String plaintext = "";
            for (int i = 0; i < cipherArray.length; i++) {
                charNumber[i] = alphabet.indexOf(cipherArray[i]); // Setter alfabetisk verdi av plaintext inn i int array

                // Bestemmer plaintext-siffer-verdien
                int decodedCharNumber;
                if (charNumber[i] - rot < 0) decodedCharNumber = alphabetArray.length + (charNumber[i] - rot);
                else decodedCharNumber = charNumber[i] - rot;

                char newDecodedChar = alphabetArray[decodedCharNumber]; // Konverterer plaintext-siffer-verdien til bokstav
                plaintext += newDecodedChar; // Setter sammen plaintext
            }
            System.out.println(" - PLAINTEXT ROT" + rot + ":\t" + plaintext); // Print
        }
    }
}
