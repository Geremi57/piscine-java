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

                String word = words[i];

                if (!word.isEmpty()) {
                    writer.write(Character.toUpperCase(word.charAt(0)));
                    writer.write(word.substring(1).toLowerCase());
                }
            }

            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}