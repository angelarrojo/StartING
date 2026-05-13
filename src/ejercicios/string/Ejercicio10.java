package ejercicios.string;

public class Ejercicio10 {
    public static void main(String[] args) {

        String password = "  PaSsw0rd2026!!  ";

        // Muestra en la pantalla la contraseña original
        // Resultado esperado:
        // [  PaSsw0rd2026!!  ]  (con espacios y con corchetes)

        // La contraseña LIMPIA se obtiene así:

        // 1. Elimina los espacios del principio y del final
        //    Resultado intermedio:
        //    PaSsw0rd2026!!

        // 2. Convierte TODA la contraseña a minúsculas
        //    Resultado intermedio:
        //    passw0rd2026!!

        // 3. Elimina todos los caracteres '!'
        //    Resultado intermedio:
        //    passw0rd2026

        // 4. Muestra en la pantalla la contraseña limpia
        //    Resultado esperado:
        //    passw0rd2026

        // RESTRICCIONES IMPORTANTES:
        // - Usa SOLO métodos de la clase String
        //      - NO uses bucles (for, while, do-while)
        //      - NO uses arrays
        //      - NO uses split ni expresiones regulares
        //      - etc.
        // - NO escribas el resultado directamente
        // - Todos los resultados deben salir a partir de la variable password

        // Pista: trim, replace
    }
}