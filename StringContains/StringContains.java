public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {

        boolean check = false;

        if (s == null) {
            return null;
        }

        // for 
        if (s.contains(subString)) {
            check = true;
        }

        return check;
        // your code here
    }
}