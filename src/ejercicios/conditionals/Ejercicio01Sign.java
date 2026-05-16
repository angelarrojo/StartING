package ejercicios.conditionals;

/**
 * IF/ELSE 1 - Signo de un número
 * ------------------------------------------------------------
 * Devuelve:
 *  - "POSITIVO" si n > 0
 *  - "NEGATIVO" si n < 0
 *  - "CERO" si n == 0
 */
public class Ejercicio01Sign {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para determinar el signo de un número.
     * @param n número entero
     * @return "POSITIVO", "NEGATIVO" o "CERO"
     */
    public static String sign(int n) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: sign");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio01Sign ===");
        
        // Test positivo
        String result1 = sign(5);
        System.out.println("sign(5) = " + result1);
        assert "POSITIVO".equals(result1) : "Error: esperado POSITIVO, obtenido " + result1;
        System.out.println("✓ Test positivo pasado");

        // Test negativo
        String result2 = sign(-5);
        System.out.println("sign(-5) = " + result2);
        assert "NEGATIVO".equals(result2) : "Error: esperado NEGATIVO, obtenido " + result2;
        System.out.println("✓ Test negativo pasado");

        // Test cero
        String result3 = sign(0);
        System.out.println("sign(0) = " + result3);
        assert "CERO".equals(result3) : "Error: esperado CERO, obtenido " + result3;
        System.out.println("✓ Test cero pasado");

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

