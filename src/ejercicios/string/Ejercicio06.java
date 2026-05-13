package ejercicios.string;

public class Ejercicio06 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "java";

        // TODO:
        // 1. Compara usando equals
        System.out.println(s1.equals(s2));

        // 2. Compara usando equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s2));
        // 3. Muestra los resultados
        System.out.println("¿Son iguales (equals)? " + s1.equals(s2));
        System.out.println("¿Son iguales (equalsIgnoreCase)? " + s1.equalsIgnoreCase(s2));

    }
}