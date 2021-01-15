public class Help {
    static void help() {
        System.out.println("----------------");
        System.out.println("RUBENS ROTBUSTER");
        System.out.println("----------------");
        System.out.println("USAGE");
        System.out.println("\t-[EN-/DECODE] [ROT FORMAT] [LANGUAGE] \"[TEXT]\" ");
        System.out.println("\t");
        System.out.println("FUNCTIONS:");
        System.out.println("\t-h, -help \t\t\tHelp screen");
        System.out.println("\t[EN-/DECODE]: \t\t\t-e (encode) or -d (decode)");
        System.out.println("\t[ROT FORMAT]: \t\t\tany number or -all (Only for decode)");
        System.out.println("\t[LANGUAGE]: \t\t\tnor or eng");
        System.out.println("\t[PLAINTEXT]/[CIPHERTEXT]: \t\"Text\"");
        System.out.println("\n");
        System.out.println("Example: rotbuster -e 13 eng \"helloworld\"");
    }
}
