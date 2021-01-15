public class Main {
    public static void main(String[] args) {
        // CALL HELP SCREEN
        if (args.length == 0 || args[0].equals("-h") || args[0].equals("-help")) {
            Help.help();

        // CALL ENCODE METHOD
        } else if (args.length == 4 && (args[0].equals("-enc") || args[0].equals("enc"))){
            int rot = Integer.parseInt(args[1]);
            String lang;
            if(args[2].equals("nor") || args[2].equals("-nor")) {
                lang = "nor";
            } else {
                lang = "eng";
            }
            String text = args[3];
            Encode.encodeSpecific(rot, lang, text);

        // CALL DECODE ALL
        } else if (args.length == 4 && (args[0].equals("-dec") || args[0].equals("dec")) && ((args[1].equals("-all") || (args[1].equals("all"))))) {
            String lang;
            if(args[2].equals("nor") || args[2].equals("-nor")) {
                lang = "nor";
            } else {
                lang = "eng";
            }
            String text = args[3];
            Decode.decodeAll(lang, text);

        // DECODE SPECIFIC ROT
        } else if (args.length == 4 && (args[0].equals("-dec") || args[0].equals("dec"))) {
            int rot = Integer.parseInt(args[1]);
            String lang;
            if(args[2].equals("nor") || args[2].equals("-nor")) {
                lang = "nor";
            } else {
                lang = "eng";
            }
            String text = args[3];
            Decode.decodeSpecific(rot, lang, text);
        }
    }
}
