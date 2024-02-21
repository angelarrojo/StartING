package strings;

public class CheckingStringRotations {
    public static boolean areRotations(String world, String worlds) {
        if (world.length() == worlds.length()) {
            return true;
        }
        return ((world + world).contains(worlds));
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        if (areRotations(s1, s2)) {
            System.out.println("Strings are rotations of each other");
        } else {
            System.out.println("Strings are not rotations of each other");
        }
    }
}
