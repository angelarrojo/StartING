package ejercicios.stringsol;

public class Ejercicio08sol {
    public static void main(String[] args) {

        String texto = "Hola Mundo";

        // 1. Muestra el texto original
        System.out.println(texto);

        // 2. Muestra la longitud del texto
        System.out.println(texto.length());

        // 3. Muestra el primer carácter del texto
        System.out.println(texto.charAt(0));

        // 4. Muestra el último carácter del texto
        System.out.println(texto.charAt(texto.length() - 1));

        // 5. Muestra solo la primera palabra
        System.out.println(texto.substring(0, texto.indexOf(" ")));

        // 6. Muestra solo la segunda palabra
        System.out.println(texto.substring(texto.indexOf(" ") + 1));

        // 7. Comprueba si el texto es igual a "hola mundo" usando equalsIgnoreCase
        System.out.println(texto.equalsIgnoreCase("hola mundo"));

        // 8. Muestra una frase final como: "El texto tiene X caracteres"
        System.out.println("El texto tiene " + texto.length() + " caracteres");
    }
}