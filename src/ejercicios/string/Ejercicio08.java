package ejercicios.string;

public class Ejercicio08 {
    public static void main(String[] args) {

        String texto = "Hola Mundo";
        System.out.println("Texto original: " + texto);
        System.out.println("Longitud: " + texto.length());
        System.out.println("Primer carácter: " + texto.charAt(0));
        System.out.println("Último carácter: " + texto.charAt(texto.length() - 1));
        String[] palabras = texto.split(" ");
        System.out.println("Primera palabra: " + palabras[0]);
        System.out.println("Segunda palabra: " + palabras[1]);
        System.out.println("¿Es igual a 'hola mundo'? " + texto.equalsIgnoreCase("hola mundo"));
        System.out.println("El texto tiene " + texto.length() + " caracteres");

        // TODO:
        // 1. Muestra el texto original
        // 2. Muestra la longitud del texto
        // 3. Muestra el primer carácter del texto
        // 4. Muestra el último carácter del texto
        // 5. Muestra solo la primera palabra
        // 6. Muestra solo la segunda palabra
        // 7. Comprueba si el texto es igual a "hola mundo" usando equalsIgnoreCase
        // 8. Muestra una frase final como: "El texto tiene X caracteres"
    }
}