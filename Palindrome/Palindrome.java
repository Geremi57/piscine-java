public class Palindrome {
    public static boolean isPalindrome(String s) {
        boolean  isPalindrome = false;
        String pal = "";

        for (int i = s.length()-1; i >= 0; i--) {
            pal += s.charAt(i);
        }

        // System.out.println(pal);
        // System.out.println(s);


        if (s.equals(pal)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}