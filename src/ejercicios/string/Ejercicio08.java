package ejercicios.string;

public class Ejercicio08 {
    public static void main(String[] args) {

        String texto = "Hola Mundo";

        System.out.println(texto);
        System.out.println(texto.length());
        System.out.println(texto.charAt(0));
        System.out.println(texto.charAt(texto.length() - 1));
        System.out.println(texto.split(" ")[0]);
        System.out.println(texto.split(" ")[1]);
        System.out.println(texto.equalsIgnoreCase("hola mundo"));
        System.out.println("El texto tiene " + texto.length() + " caracteres");


    }
}