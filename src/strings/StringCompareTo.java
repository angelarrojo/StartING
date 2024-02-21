package strings;

public class StringCompareTo {
    public static void main(String[] args) {
        String word = "starting";
        String words = "art";

        int total = word.compareTo(words);

        if (total == 0) {
            System.out.println("Same");
        }

        if (total > 0) {
            System.out.println(word + " " + "word is Greater");
        }

        if (total < 0) {
            System.out.println("words is smaller");
        }
    }
}
