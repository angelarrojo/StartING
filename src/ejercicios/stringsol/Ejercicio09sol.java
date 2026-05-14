package ejercicios.stringsol;

public class Ejercicio09sol {
    public static void main(String[] args) {

        String email = "ana.perez@empresa.com";

        // Muestra en la pantalla el email completo
        System.out.println(email);

        // Índices importantes
        int punto = email.indexOf(".");
        int arroba = email.indexOf("@");
        int ultimoPunto = email.lastIndexOf(".");

        // Muestra en la pantalla el nombre
        System.out.println(email.substring(0, punto));

        // Muestra en la pantalla el apellido
        System.out.println(email.substring(punto + 1, arroba));

        // Muestra en la pantalla el usuario completo
        System.out.println(email.substring(0, arroba));

        // Muestra en la pantalla el nombre de la empresa
        System.out.println(email.substring(arroba + 1, ultimoPunto));

        // Muestra en la pantalla la extensión del dominio
        System.out.println(email.substring(ultimoPunto + 1));

        // Muestra en la pantalla la siguiente frase: "Usuario: ANA PEREZ"
        String nombreMayus = email.substring(0, punto).toUpperCase();
        String apellidoMayus = email.substring(punto + 1, arroba).toUpperCase();
        System.out.println("Usuario: " + nombreMayus + " " + apellidoMayus);
    }
}
