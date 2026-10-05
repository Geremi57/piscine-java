public class CleanExtract {
    public static String extract(String s) {
        String[] parts = s.split("\\|");
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            part = part.replace(".", "").trim();

            if (!part.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(part);
            }
        }

        return result.toString();
    }
}