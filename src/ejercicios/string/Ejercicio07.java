

public class Ejercicio07 {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;
        String s1 = "Texto";
        String s2 = new String("Texto");

        // 1. Compara x e y con ==
        System.out.println("x == y: " + (x == y));

        // 2. Compara s1 y s2 con ==
        System.out.println("s1 == s2: " + (s1 == s2));

        // 3. Compara s1 y s2 con equals
        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}