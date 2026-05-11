package strings.t0511;

public class StringComoObjeto {
    public static void main(String[] args) {

        /*
         ===================================================
         TIPO PRIMITIVO
         ===================================================

         int edad = 20;

         La variable contiene DIRECTAMENTE el valor:

              +------+
         edad |  20  |
              +------+

         - Guarda un valor simple
         - No apunta a ningún objeto
         - No tiene métodos
        */

        int edad = 20;

        /*
         ===================================================
         STRING (OBJETO)
         ===================================================

         String nombre = "Carlos";

         La variable NO contiene el texto.
         La variable contiene una REFERENCIA (dirección) que apunta a un objeto String.

                +------------+
         nombre | referencia |
                +------------+
                       |
                       v
              +------------------+
              | Objeto String    |
              |------------------|
              | "Carlos"         |
              +------------------+

         - String es un objeto
         - La variable apunta al objeto
         - El objeto guarda el texto
         - El objeto tiene métodos
        */

        String nombre = "Carlos";

        // Tipo primitivo: la variable es la caja y dentro está directamente el dato.
        // String: la variable no es la caja, solo tiene una dirección que señala a la caja donde está el texto.

        System.out.println(edad);
        System.out.println(nombre);
    }
}
