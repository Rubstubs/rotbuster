package no.rubstubs;

import java.util.ArrayList;

public class Decode {
    static String decodeSpecific(int rot, String ciphertext) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        if (rot < 1 || rot > alphabet.length()) {
            PrintToScreen.wrongRotAmt(alphabet);
            return null;
        }

        ArrayList<String> allDecoded = Shifter.getAllShifts(ciphertext);
        String plaintext =  allDecoded.get(rot);

        PrintToScreen.printDecoded(rot, plaintext, ciphertext);
        return plaintext;
    }

    static ArrayList<String> decodeAll(String ciphertext) {

        ArrayList<String> allDecoded = Shifter.getAllShifts(ciphertext);

        PrintToScreen.allDecoded(allDecoded);

        return allDecoded;
    }

}
