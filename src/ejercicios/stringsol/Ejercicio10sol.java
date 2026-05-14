package ejercicios.stringsol;

public class Ejercicio10sol {
    public static void main(String[] args) {

        String password = "  PaSsw0rd2026!!  ";

        // Mostrar contraseña original (con espacios)
        System.out.println("[" + password + "]");

        // 1. Elimina los espacios del principio y del final
        String limpia = password.trim();

        // 2. Convierte TODA la contraseña a minúsculas
        limpia = limpia.toLowerCase();

        // 3. Elimina todos los caracteres '!'
        limpia = limpia.replace("!", "");

        // 4. Muestra en la pantalla la contraseña limpia
        System.out.println(limpia);
    }
}