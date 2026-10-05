public class CleanExtract {

    public static String extract(String s) {

        String[] parts = s.split("\\|");
        StringBuilder result = new StringBuilder();

        for (String part : parts) {

            part = part.trim();

            int firstDot = part.indexOf('.');
            int lastDot = part.lastIndexOf('.');

            String extracted;

            if (firstDot == -1) {
                extracted = part;
            } else if (firstDot == lastDot) {
                extracted = part.substring(firstDot + 1);
            } else {
                extracted = part.substring(firstDot + 1, lastDot);
            }

            extracted = extracted.trim();

            if (!extracted.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }

                result.append(extracted);
            }
        }

        return result.toString();
    }
}