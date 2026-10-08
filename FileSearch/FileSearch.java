import java.io.*;

public class FileSearch {

    public static String searchFile(String fileName) {
        File documents = new File("documents");

        return search(documents, fileName);
    }

    private static String search(File directory, String fileName) {
        File[] files = directory.listFiles();

        if (files == null) {
            return null;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                return file.getPath();
            }

            if (file.isDirectory()) {
                String result = search(file, fileName);

                if (result != null) {
                    return result;
                }
            }
        }

        return null;
    }
}