import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        int character;
        boolean startOfWord = true;

        while ((character = reader.read()) != -1) {
            char c = (char) character;

            if (Character.isWhitespace(c)) {
                writer.write(c);
                startOfWord = true;
            } else {
                if (startOfWord) {
                    writer.write(Character.toUpperCase(c));
                    startOfWord = false;
                } else {
                    writer.write(c);
                }
            }
        }

        reader.close();
        writer.close();
    }
}