package ejercicios.conditionals;

/**
 * SWITCH 1 - Día de la semana
 * ------------------------------------------------------------
 * Dado un número del 1 al 7, devuelve:
 *  1->"LUNES", 2->"MARTES", ... 7->"DOMINGO"
 * Si no está en rango -> IllegalArgumentException
 */
public class Ejercicio06DayOfWeek {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para devolver el nombre del día de la semana.
     * @param day número del día (1-7)
     * @return nombre del día en mayúsculas
     */
    public static String dayOfWeek(int day) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: dayOfWeek");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio06DayOfWeek ===");
        
        // Test lunes
        String result1 = dayOfWeek(1);
        System.out.println("dayOfWeek(1) = " + result1);
        assert "LUNES".equals(result1) : "Error: esperado LUNES, obtenido " + result1;
        System.out.println("✓ Test lunes pasado");

        // Test domingo
        String result2 = dayOfWeek(7);
        System.out.println("dayOfWeek(7) = " + result2);
        assert "DOMINGO".equals(result2) : "Error: esperado DOMINGO, obtenido " + result2;
        System.out.println("✓ Test domingo pasado");

        // Test fuera de rango
        try {
            dayOfWeek(0);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para 0");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test 0 lanza IllegalArgumentException correctamente");
        }

        try {
            dayOfWeek(8);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para 8");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test 8 lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

