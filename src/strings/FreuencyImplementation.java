package strings;

public class FreuencyImplementation {
    public static void main(String[] args) {
        String name = "ingforing";
        int[] count = new int[26];

        for (int i = 0; i < name.length(); i++) {
            count[name.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }
    }
}