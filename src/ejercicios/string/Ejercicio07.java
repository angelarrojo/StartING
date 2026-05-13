package ejercicios.string;

public class Ejercicio07 {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;

        String s1 = "Texto";
        String s2 = new String("Texto");

        System.out.println(x == y);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // 4. Explicación:
        // x == y devuelve true porque los int se comparan por valor.
        // s1 == s2 devuelve false porque == en objetos compara la dirección
        // de memoria, no el contenido. s1 y s2 apuntan a objetos distintos
        // aunque tengan el mismo texto.
        // s1.equals(s2) devuelve true porque equals compara el contenido
        // del String, no la dirección de memoria.

    }
}