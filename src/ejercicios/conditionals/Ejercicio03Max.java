package ejercicios.conditionals;

/**
 * IF/ELSE 3 - Máximo de dos números
 * ------------------------------------------------------------
 * Devuelve el mayor de a y b.
 */
public class Ejercicio03Max {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para devolver el mayor de dos números.
     * @param a primer número
     * @param b segundo número
     * @return el mayor de los dos
     */
    public static int max(int a, int b) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: max");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio03Max ===");
        
        // Test a > b
        int result1 = max(10, 3);
        System.out.println("max(10, 3) = " + result1);
        assert result1 == 10 : "Error: esperado 10, obtenido " + result1;
        System.out.println("✓ Test a > b pasado");

        // Test a < b
        int result2 = max(3, 10);
        System.out.println("max(3, 10) = " + result2);
        assert result2 == 10 : "Error: esperado 10, obtenido " + result2;
        System.out.println("✓ Test a < b pasado");

        // Test a == b
        int result3 = max(7, 7);
        System.out.println("max(7, 7) = " + result3);
        assert result3 == 7 : "Error: esperado 7, obtenido " + result3;
        System.out.println("✓ Test a == b pasado");

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

