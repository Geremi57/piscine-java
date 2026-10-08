import java.io.*;

public class FileManager {

    public static void createFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }

    public static String getContentFile(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        StringBuilder content = new StringBuilder();

        int character;

        while ((character = reader.read()) != -1) {
            content.append((char) character);
        }

        reader.close();

        return content.toString();
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}