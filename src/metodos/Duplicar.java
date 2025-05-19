package metodos;

public class Duplicar {
    public static void main(String[] args) {

        int minumero = 109;
        System.out.println("mi numero duplicado es : " + duplicar(minumero));
        System.out.println("mi numero duplicado dos veces es : " + duplicar( duplicar(minumero) ));
    }
    public static int duplicar(int numero) {
        return numero * 2;
    }
}