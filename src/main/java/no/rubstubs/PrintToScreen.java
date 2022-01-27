package no.rubstubs;

import java.util.ArrayList;

public class PrintToScreen {
    static void help() {
        System.out.println("----------------");
        System.out.println("ROTBUSTER");
        System.out.println("----------------");
        System.out.println("USAGE");
        System.out.println("\t[MODE] [ROT FORMAT] [TEXT]");
        System.out.println("\t");
        System.out.println("FUNCTIONS:");
        System.out.println("\t[MODE]: \t\tdec / enc / help");
        System.out.println("\t\t\t\tdec:    Decrypt");
        System.out.println("\t\t\t\tenc:    Encrypt");
        System.out.println("\t\t\t\thelp:   Help screen");

        System.out.println("\n\t[ROT FORMAT]: \t\t1-25 / all");
        System.out.println("\t\t\t\t1-25:   Number representing ROT format");
        System.out.println("\t\t\t\tall:    Show all possible decryptions (only for dec mode)");
        System.out.println("\n\t[TEXT]: \t\tText (no spaces or special characters outside english alphabet)");
        System.out.println("\n");
        System.out.println("java -jar .\\target\\rotbuster-1.0-SNAPSHOT.jar enc 13 helloworld");
    }

    static void printEncoded(int rot, String plaintext, String ciphertext) {
        System.out.println("\nENCODING ROT" + rot + "\n");
        System.out.println(" - PLAINTEXT:   " + plaintext);
        System.out.println(" - CIPHERTEXT:  " + ciphertext.toUpperCase());
    }

    static void printDecoded(int rot, String plaintext, String ciphertext) {
        System.out.println("\nDECODING ROT" + rot + "\n");
        System.out.println(" - CIPHERTEXT:  " + ciphertext.toUpperCase());
        System.out.println(" - PLAINTEXT:   " + plaintext);
    }

    static void wrongRotAmt(String alphabet){
        System.out.println("\nERROR: CHOOSE ROT FORMAT BETWEEN 1 AND 25!");
    }

    static void allDecoded(ArrayList<String> allDecoded) {
        System.out.println("\nDECODING ALL ROTS FROM CIPHERTEXT: " + allDecoded.get(0) + "\n");
        for (int i = 0; i < allDecoded.size(); i++) {
            System.out.println(" - PLAINTEXT ROT" + i  + ":\t" + allDecoded.get(i));
        }

    }

}
