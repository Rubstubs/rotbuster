public class Encode {
    static void encodeSpecific(int rot, String language, String plaintext) {
        String alphabet = "";
        if (language.equals("nor")) {
            alphabet = "abcdefghijklmnopqrstuvwxyzøæå"; // referansealfabet
        } else if (language.equals("eng")) {
            alphabet = "abcdefghijklmnopqrstuvwxyz"; // referansealfabet
        } else {
            System.out.println("NOT A VALID LANGUAGE");
            return;
        }

        char[] alphabetArray = alphabet.toCharArray(); // alfabetet nummereres
        char[] plaintextArray = (plaintext.toLowerCase()).toCharArray(); // Code til array
        int[] charNumber = new int[plaintext.length()]; // code til nummer i array
        String ciphertext = "";

        for (int i = 0; i < plaintextArray.length; i++) {
            charNumber[i] = alphabet.indexOf(plaintextArray[i]);
            int encodedCharNumber;

            if (charNumber[i] + rot > alphabetArray.length-1) {
                encodedCharNumber = (charNumber[i] + rot) - alphabetArray.length;
            } else {
                encodedCharNumber = (charNumber[i] + rot);
            }
            char newEncodedChar = alphabetArray[encodedCharNumber];
            ciphertext += newEncodedChar;
        }
        System.out.println("ENCODING ROT" + rot + ":");
        System.out.println(" - PLAINTEXT:   " + plaintext);
        System.out.println(" - CIPHERTEXT:  " + ciphertext.toUpperCase());
    }
}
