import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.trim().split("\\s+");

            for (int i = 0; i < words.length; i++) {
                if (i > 0) {
                    writer.write(" ");
                }

                if (!words[i].isEmpty()) {
                    writer.write(Character.toUpperCase(words[i].charAt(0)));
                    writer.write(words[i].substring(1));
                }
            }

            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}