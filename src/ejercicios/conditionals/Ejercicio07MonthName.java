package ejercicios.conditionals;

/**
 * SWITCH 2 - Mes del año
 * ------------------------------------------------------------
 * Dado un número del 1 al 12 devuelve el nombre del mes en MAYÚSCULAS.
 * Si no está en rango -> IllegalArgumentException
 */
public class Ejercicio07MonthName {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para devolver el nombre del mes.
     * @param month número del mes (1-12)
     * @return nombre del mes en mayúsculas
     */
    public static String monthName(int month) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: monthName");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio07MonthName ===");
        
        // Test enero
        String result1 = monthName(1);
        System.out.println("monthName(1) = " + result1);
        assert "ENERO".equals(result1) : "Error: esperado ENERO, obtenido " + result1;
        System.out.println("✓ Test enero pasado");

        // Test diciembre
        String result2 = monthName(12);
        System.out.println("monthName(12) = " + result2);
        assert "DICIEMBRE".equals(result2) : "Error: esperado DICIEMBRE, obtenido " + result2;
        System.out.println("✓ Test diciembre pasado");

        // Test fuera de rango
        try {
            monthName(0);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para 0");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test 0 lanza IllegalArgumentException correctamente");
        }

        try {
            monthName(13);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para 13");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test 13 lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

