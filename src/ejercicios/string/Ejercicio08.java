package ejercicios.string;

public class Ejercicio08 {
    public static void main(String[] args) {

        String texto = "Hola Mundo";

        // TODO:
        // 1. Muestra el texto original
        // 2. Muestra la longitud del texto
        // 3. Muestra el primer carácter del texto
        // 4. Muestra el último carácter del texto
        // 5. Muestra solo la primera palabra
        // 6. Muestra solo la segunda palabra
        // 7. Comprueba si el texto es igual a "hola mundo" usando equalsIgnoreCase
        // 8. Muestra una frase final como: "El texto tiene X caracteres"
        1. Muestra el texto original
         System.out.println("Texto otiginal:"+texto);
        2. Muestra la longitud del texto
                System.out.println("Texto longitud original: "+texto);
        3. Muestra el primer carácter del texto
                System.out.println(" Primer caracter: "+ texto.chaArt(0));
        4. Muestra el último carácter del texto
                System.out.println("Ultimo caracter: " + texto.chaArt(texto.length()-1));
        5. Muestra solo la primera palabra
                System.out.println("Primera palabra: " + texto.split("")[0]);
        6. Muestra solo la segunda palabra
                System.out.println("Segunda palabra: "+texto.split("")[1]);
        7. Comprueba si el texto es igual a "hola mundo" usando equalsIgnoreCase
                System.out.println("¿El texto es igual a 'hola mundo'?"));
        8. Muestra una frase final como: "El texto tiene X caracteres"
                System.out.println("El texto tiene " + texto.length() +"caracteres");
        

    }
}