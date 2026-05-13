package ejercicios.string;

public class Ejercicio07 {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;

        String s1 = "Texto";
        String s2 = new String("Texto");

        System.out.println(x == y);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("== compara si es el mismo objeto en memoria");
        System.out.println("equals compara directamente el contenido");
    }
}