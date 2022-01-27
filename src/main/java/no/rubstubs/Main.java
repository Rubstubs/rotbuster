package no.rubstubs;

public class Main {
    public static void main(String[] args) {
        // CALL HELP SCREEN
        if (args.length == 0) {
            PrintToScreen.help();
        } else {
            switch(args[0]) {
                case "help":
                    PrintToScreen.help();
                    break;
                case "enc":

                    assert(args.length == 3);

                    int rot = Integer.parseInt(args[1]);
                    String text = args[2];
                    Encode.encodeSpecific(rot, text);
                    break;
                case "dec":

                    assert(args.length == 3);

                    String mode = args[1];
                    String cipher = args[2];

                    if (mode.equals("all")) {
                        Decode.decodeAll(cipher);
                    } else Decode.decodeSpecific(Integer.parseInt(mode), cipher);
                    break;
            }
        }
    }
}
