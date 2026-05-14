package ejercicios.stringsol;

public class Ejercicio06sol {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "java";

        // 1. Compara usando equals
        boolean resultadoEquals = s1.equals(s2);

        // 2. Compara usando equalsIgnoreCase
        boolean resultadoIgnoreCase = s1.equalsIgnoreCase(s2);

        // 3. Muestra los resultados
        System.out.println("Resultado con equals: " + resultadoEquals);
        System.out.println("Resultado con equalsIgnoreCase: " + resultadoIgnoreCase);
    }
}
