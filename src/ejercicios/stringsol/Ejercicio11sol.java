package ejercicios.stringsol;

public class Ejercicio11sol {
    public static void main(String[] args) {

        String mensaje = "Hola -MUNDO";

        int espacio = mensaje.indexOf(" ");
        int guion = mensaje.indexOf("-");

        String resultado = mensaje.substring(0, espacio).toUpperCase() + "_" + mensaje.substring(guion + 1).toLowerCase();
        System.out.println(resultado);

        /*
         EJERCICIO:

         NO se puede modificar el código.
         SOLO se puede cambiar el contenido de la variable mensaje.

         OBJETIVO:
         Consigue que la salida sea EXACTAMENTE:

         HOLA_mundo

         PISTAS:
         - El programa usa la posición del PRIMER espacio
         - El programa usa la posición del PRIMER guion '-'
         - Parte del mensaje se pierde
         - Parte del mensaje se transforma a mayúsculas
         - Parte del mensaje se transforma a minúsculas

         RESTRICCIONES:
         - NO se puede tocar el código
         - NO se pueden escribir los resultados a mano
         - SOLO se modifica el valor de mensaje
        */
    }
}