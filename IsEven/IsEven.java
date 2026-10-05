public class IsEven {
    public static boolean isEven(int a) {
        boolean even = false;

        if (a > 1 && a % 2 == 0) {
            even = true;
        }

        return even;
    }
}