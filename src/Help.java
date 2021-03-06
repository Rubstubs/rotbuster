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
        System.out.println("\t[EN-/DECODE]: \t\t\t-enc/enc (encode) or -dec/dec (decode)");
        System.out.println("\t[ROT FORMAT]: \t\t\tnumber representing ROT format, or -all/all(Only for decode)");
        System.out.println("\t[LANGUAGE]: \t\t\t-nor/nor or -eng/eng");
        System.out.println("\t[PLAINTEXT]/[CIPHERTEXT]: \t\"Text\" (no spaces or special characters)");
        System.out.println("\n");
        System.out.println("Example: rotbuster -enc 13 -eng \"helloworld\"");
    }
}
