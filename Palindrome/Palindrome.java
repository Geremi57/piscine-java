public class Palindrome {
    public static boolean isPalindrome(String s) {
        boolean  isPalindrome = false;

        if (s == null){
            return false;
        }

        String lowerS = s.toLowerCase();

        String pal = "";

        for (int i = lowerS.length()-1; i >= 0; i--) {
            pal += lowerS.charAt(i);
        }

        // System.out.println(pal);
        // System.out.println(s);


        if (lowerS.equals(pal)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}