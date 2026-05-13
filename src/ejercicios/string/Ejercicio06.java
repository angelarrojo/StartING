package ejercicios.string;

public class Ejercicio06 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "java";

        boolean a = s1.equals(s2);
        boolean b = s1.equalsIgnoreCase(s2);

        System.out.println("equals: " + a);
        System.out.println("equalsIgnoreCase: " + b);


    }
}