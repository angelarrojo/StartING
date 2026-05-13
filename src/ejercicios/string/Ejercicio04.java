package ejercicios.string;

public class Ejercicio04 {
    public static void main(String[] args) {

        String texto = "Mensaje";

        // TODO:
        // 1. Muestra el primer carácter
        System.out.println(texto.charAt(0));
        // 2. Muestra el último carácter
        Usamos length() - 1 porque los índices van de 0 a esta es la formula que se utiliza (longitud - 1)
        System.out.println(texto.charAt(texto.length() - 1));
    }
}