import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        int c;
        boolean startOfWord = true;
        boolean pendingSpace = false;

        while ((c = reader.read()) != -1) {
            char ch = (char) c;

            if (Character.isWhitespace(ch)) {
                if (ch == '\n') {
                    writer.newLine();
                    startOfWord = true;
                    pendingSpace = false;
                } else {
                    pendingSpace = true;
                }
            } else {
                if (pendingSpace) {
                    writer.write(" ");
                    pendingSpace = false;
                }

                if (startOfWord) {
                    writer.write(Character.toUpperCase(ch));
                    startOfWord = false;
                } else {
                    writer.write(ch);
                }
            }
        }

        reader.close();
        writer.close();
    }
}