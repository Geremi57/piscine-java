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
            String[] words = line.split(" ", -1);

            for (int i = 0; i < words.length; i++) {
                if (!words[i].isEmpty()) {
                    words[i] = Character.toUpperCase(words[i].charAt(0))
                            + words[i].substring(1);
                }

                if (i > 0) {
                    writer.write(" ");
                }

                writer.write(words[i]);
            }

            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}