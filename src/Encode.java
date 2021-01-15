public class Encode {
    static void encodeSpecific(int rot, String language, String plaintext) {

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
            System.out.println("CHOOSE A ROT FORMAT BETWEEN 1 AND " + (alphabetArray.length-1) + "!");
            return;
        }

        char[] plaintextArray = (plaintext.toLowerCase()).toCharArray(); // plaintext til array
        int[] charNumber = new int[plaintext.length()]; // code til nummer i array

        // Konvertering
        String ciphertext = "";
        for (int i = 0; i < plaintextArray.length; i++) {
            charNumber[i] = alphabet.indexOf(plaintextArray[i]); // Setter alfabetisk verdi av plaintext inn i int array

            // Bestemmer ROT-siffer-verdien
            int encodedCharNumber;
            if (charNumber[i] + rot > alphabetArray.length-1) encodedCharNumber = (charNumber[i] + rot) - alphabetArray.length;
            else encodedCharNumber = (charNumber[i] + rot);

            char newEncodedChar = alphabetArray[encodedCharNumber]; // Konverterer ROT-siffer-verdien til bokstav

            ciphertext += newEncodedChar; // Setter sammen ciphertext
        }
        // Print
        System.out.println("\nENCODING ROT" + rot + "\n");
        System.out.println(" - PLAINTEXT:   " + plaintext);
        System.out.println(" - CIPHERTEXT:  " + ciphertext.toUpperCase());
    }
}
