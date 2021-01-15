public class Decode {
    static void decodeSpecific(int rot, String language, String ciphertext) {
        String alphabet;
        if (language.equals("nor")) {
            alphabet = "abcdefghijklmnopqrstuvwxyzøæå"; // referansealfabet
        } else if (language.equals("eng")) {
            alphabet = "abcdefghijklmnopqrstuvwxyz"; // referansealfabet
        } else {
            System.out.println("NOT A VALID LANGUAGE");
            return;
        }

        char[] alphabetArray = alphabet.toCharArray(); // alfabetet nummereres
        char[] cipherArray = (ciphertext.toLowerCase()).toCharArray(); // Code til array
        int[] charNumber = new int[ciphertext.length()]; // code til nummer i array
        String plaintext = "";

        for (int i = 0; i < cipherArray.length; i++) {
            charNumber[i] = alphabet.indexOf(cipherArray[i]);
            int decodedCharNumber;

            if (charNumber[i] - rot < 0) {
                decodedCharNumber = alphabetArray.length + (charNumber[i] - rot);
            } else {
                decodedCharNumber = charNumber[i] - rot;
            }
            char newDecodedChar = alphabetArray[decodedCharNumber];
            plaintext += newDecodedChar;
        }


        System.out.println("DECODING ROT" + rot);
        System.out.println(" - CIPHERTEXT:  " + ciphertext.toUpperCase());
        System.out.println(" - PLAINTEXT:   " + plaintext);
    }

    static void decodeAll(String language, String ciphertext) {
        System.out.println("DECODING ALL ROTS:");
        String alphabet = "";
        if (language.equals("nor")) {
            alphabet = "abcdefghijklmnopqrstuvwxyzøæå"; // referansealfabet
        } else if (language.equals("eng")) {
            alphabet = "abcdefghijklmnopqrstuvwxyz"; // referansealfabet
        }
        char[] alphabetArray = alphabet.toCharArray(); // alfabetet nummereres
        char[] cipherArray = (ciphertext.toLowerCase()).toCharArray(); // Code til array
        int[] charNumber = new int[ciphertext.length()]; // code til nummer i array

        for (int rot = 1; rot < alphabetArray.length; rot++) {
            String plaintext = "";
            for (int i = 0; i < cipherArray.length; i++) {
                charNumber[i] = alphabet.indexOf(cipherArray[i]);
                int decodedCharNumber;
                if (charNumber[i] - rot < 0) {
                    decodedCharNumber = alphabetArray.length + (charNumber[i] - rot);
                } else {
                    decodedCharNumber = charNumber[i] - rot;
                }
                char newDecodedChar = alphabetArray[decodedCharNumber];
                plaintext += newDecodedChar;
            }
            System.out.println(" - PLAINTEXT ROT" + rot + ":\t" + plaintext);
        }
    }
}
