

public class Ejercicio08 {
    public static void main(String[] args) {

        String texto = "Hola Mundo";

        // TODO:
        // 1. Muestra el texto original
        System.out.println("Texto original: " + texto);
        // 2. Muestra la longitud del texto
        System.out.println("Longitud: " + texto.length());
        // 3. Muestra el primer carácter del texto
        System.out.println("Primer carácter: " + texto.charAt(0));
        // 4. Muestra el último carácter del texto
        System.out.println("Último carácter: " + texto.charAt(texto.length() - 1));
        // 5. Muestra solo la primera palabra
        System.out.println("Primera palabra: " + texto.substring(0, 4));
        // 6. Muestra solo la segunda palabra
        System.out.println("Segunda palabra: " + texto.substring(5));
        // 7. Comprueba si el texto es igual a "hola mundo" usando equalsIgnoreCase
        System.out.println("¿Igual a 'hola mundo'? " + texto.equalsIgnoreCase("hola mundo"));

        // 8. Muestra una frase final como: "El texto tiene X caracteres"
        System.out.println("El texto tiene " + texto.length() + " caracteres");
    }
    }
