package strings;

public class EfficientPalindromeChecking {
    public static boolean isPalindromeChecking(String checking) {
        int being = 0;
        int end = checking.length() - 1;
        while (being < end) {
            if (checking.charAt(being) != checking.charAt(end)) {
                System.out.println("Not the same");
            }
            being++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeChecking("abcba"));
    }

}
