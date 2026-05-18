package ejercicios.string;

public class Ejercicio06 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "java";

        // TODO:
        // 1. Compara usando equals
        // Este método es sensible a las  mayúsculas y minúsculas.
        boolean resultadoEquals = s1.equals(s2);
        // 2. Compara usando equalsIgnoreCase
        // Este método ignora las mayúsculas o minúsculas.
        boolean resultadoIgnoreCase = s1.equalsIgnoreCase(s2);
        // 3. Muestra los resultados
        System.out.println(resultadoEquals);
        System.out.println(resultadoIgnoreCase);

    }
}