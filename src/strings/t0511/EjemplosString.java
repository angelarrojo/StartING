package strings.t0511;

public class EjemplosString {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

        // =========================================
        // CONCATENACIÓN DE STRINGS
        // =========================================

        String nombre = "Ana";
        int edad = 22;

        // El operador + une (concatena) textos
        String mensaje = "Hola, me llamo " + nombre;
        System.out.println(mensaje);

        // También podemos concatenar texto + números
        System.out.println("Edad: " + edad);

        // Concatenar varias cosas
        System.out.println(nombre + " tiene " + edad + " años");


        // =========================================
        // INMUTABILIDAD DE STRING
        // =========================================

        String s = "Hola";

        // Parece que cambiamos el String...
        s = s + " Mundo";

        System.out.println(s); // Hola Mundo

        /*
         - Los String son INMUTABLES
         - Eso significa que NO se pueden cambiar

         Cuando hacemos:
             s = s + " Mundo";

         NO se modifica el String "Hola".
         Java crea un NUEVO objeto String con:
             "Hola Mundo"

         y s pasa a apuntar a ese nuevo objeto.

             ANTES:
             s ───> "Hola"

             DESPUÉS:
             s ───> "Hola Mundo"
                    (nuevo objeto)

         El String original "Hola" NO cambia.
        */


        // =========================================
        // CREAR UN OBJETO STRING
        // =========================================

        String texto = "Hola Mundo";
        String texto2 = new String("Hola Mundo 2");

        System.out.println(texto);
        System.out.println(texto2);
        System.out.println("Probar syso");
        System.out.println("Texto original: " + texto);


        // =========================================
        // length() -> número de caracteres
        // =========================================

        System.out.println("Longitud del texto: " + texto.length()); // 10


        // =========================================
        // charAt(x) -> carácter en una posición
        // Las posiciones empiezan en 0
        // =========================================

        System.out.println("Carácter en posición 0: " + texto.charAt(0)); // H
        System.out.println("Carácter en posición 4: " + texto.charAt(4)); // espacio
        System.out.println("Carácter en posición 5: " + texto.charAt(5)); // M
        System.out.println("Carácter en posición 9: " + texto.charAt(9)); // o

        // Ejemplo de OUT OF BOUNDS (comentado para que no rompa el programa)
        // System.out.println(texto.charAt(10)); // ERROR: fuera del String


        // =========================================
        // substring(x, y) -> extrae parte del texto
        // Empieza en x (incluido) y termina en y (excluido)
        // =========================================

        System.out.println("Substring (0, 4): " + texto.substring(0, 4)); // Hola
        System.out.println("Substring (5, 10): " + texto.substring(5, 10)); // Mundo

        // Ejemplo de OUT OF BOUNDS (comentado)
        // System.out.println(texto.substring(3, 15)); // ERROR


        // =========================================
        // equals(cadena) -> compara textos (case sensitive)
        // =========================================

        String a = "Java";
        String b = "Java";
        String c = "java";

        System.out.println("a equals b: " + a.equals(b)); // true
        System.out.println("a equals c: " + a.equals(c)); // false


        // =========================================
        // COMPARACIONES: primitivos vs String
        // =========================================

        int x = 5;
        int y = 5;

        // En tipos primitivos, == compara LOS VALORES
        System.out.println("x == y: " + (x == y)); // true

        String s1 = "Java";
        String s2 = "Java";

        // En String, == compara LAS REFERENCIAS
        System.out.println("s1 == s2: " + (s1 == s2)); // true

        /*
         ¿Por qué aquí da true?

         Porque los String creados con "" se guardan en el STRING POOL.
         Si el texto ya existe, Java reutiliza el mismo objeto.

             s1 ─┐
                 ├──> "Java"   (String Pool)
             s2 ─┘

         s1 y s2 apuntan al MISMO objeto.
        */

        String s4 = new String("Java");
        String s5 = new String("Java");

        System.out.println("s4 == s5: " + (s4 == s5)); // false

        /*
             s4 ───> "Java"   (Objeto distinto)
             s5 ───> "Java"   (Objeto distinto)

         El contenido es igual, pero las referencias son distintas.
        */


        // =========================================
        // equalsIgnoreCase(cadena) -> ignora mayúsculas
        // =========================================

        System.out.println("a equalsIgnoreCase c: " + a.equalsIgnoreCase(c)); // true


        // =========================================
        // isEmpty() -> comprueba si la cadena está vacía
        // =========================================

        String vacia = "";
        String noVacia = "Hola";

        System.out.println("¿vacia está vacía?: " + vacia.isEmpty());     // true
        System.out.println("¿noVacia está vacía?: " + noVacia.isEmpty()); // false


        // =========================================
        // compareTo(cadena) -> compara alfabéticamente
        // =========================================

        String a1 = "Ana";
        String a2 = "Luis";
        String a3 = "Ana";

        System.out.println("a1 compareTo a2: " + a1.compareTo(a2)); // negativo -> A - L = 65 - 76 = -11
        System.out.println("a2 compareTo a1: " + a2.compareTo(a1)); // positivo
        System.out.println("a1 compareTo a3: " + a1.compareTo(a3)); // 0
    }
}
