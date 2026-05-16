package ejercicios.conditionals;

/**
 * IF/ELSE 4 - Año bisiesto
 * ------------------------------------------------------------
 * Devuelve true si el año es bisiesto.
 * Regla:
 *  - divisible entre 4
 *  - NO divisible entre 100
 *  - EXCEPTO si es divisible entre 400
 * Si year <= 0 -> IllegalArgumentException
 */
public class Ejercicio04IsLeapYear {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para determinar si un año es bisiesto.
     * @param year año a verificar
     * @return true si es bisiesto, false en caso contrario
     */
    public static boolean isLeapYear(int year) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: isLeapYear");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio04IsLeapYear ===");
        
        // Test año bisiesto común (divisible por 4)
        boolean result1 = isLeapYear(2024);
        System.out.println("isLeapYear(2024) = " + result1);
        assert result1 : "Error: 2024 debería ser bisiesto";
        System.out.println("✓ Test 2024 bisiesto pasado");

        // Test año no bisiesto
        boolean result2 = isLeapYear(2023);
        System.out.println("isLeapYear(2023) = " + result2);
        assert !result2 : "Error: 2023 no debería ser bisiesto";
        System.out.println("✓ Test 2023 no bisiesto pasado");

        // Test año divisible por 100 pero no por 400 (no bisiesto)
        boolean result3 = isLeapYear(1900);
        System.out.println("isLeapYear(1900) = " + result3);
        assert !result3 : "Error: 1900 no debería ser bisiesto";
        System.out.println("✓ Test 1900 no bisiesto pasado");

        // Test año divisible por 400 (bisiesto)
        boolean result4 = isLeapYear(2000);
        System.out.println("isLeapYear(2000) = " + result4);
        assert result4 : "Error: 2000 debería ser bisiesto";
        System.out.println("✓ Test 2000 bisiesto pasado");

        // Test año inválido -> IllegalArgumentException
        try {
            isLeapYear(0);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para año 0");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test año 0 lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

