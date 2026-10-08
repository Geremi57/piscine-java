import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }

        FileReader reader = new FileReader(args[0]);
        FileWriter writer = new FileWriter(args[1]);

        int character;
        boolean capitalizeNext = true;

        while ((character = reader.read()) != -1) {
            char c = (char) character;

            if (capitalizeNext && Character.isLetter(c)) {
                writer.write(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                writer.write(c);

                if (Character.isLetter(c)) {
                    capitalizeNext = false;
                }
            }
        }

        reader.close();
        writer.close();
    }
}