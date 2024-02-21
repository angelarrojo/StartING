package strings;

public class NaviePalindromeChecking {
    public static boolean isPalindromeChecking(String check) {
        StringBuilder temp = new StringBuilder(check);
        temp.reverse();
        return check.equals(temp.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeChecking("abcba"));
    }
}
