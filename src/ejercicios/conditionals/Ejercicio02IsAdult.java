package ejercicios.conditionals;

/**
 * IF/ELSE 2 - Mayoría de edad
 * ------------------------------------------------------------
 * Devuelve "MAYOR" si edad >= 18, en caso contrario "MENOR".
 * Regla: si edad < 0 -> IllegalArgumentException
 */
public class Ejercicio02IsAdult {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para determinar si una persona es mayor de edad.
     * @param edad edad de la persona
     * @return "MAYOR" si edad >= 18, "MENOR" en caso contrario
     */
    public static String isAdult(int edad) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: isAdult");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio02IsAdult ===");
        
        // Test menor de edad
        String result1 = isAdult(17);
        System.out.println("isAdult(17) = " + result1);
        assert "MENOR".equals(result1) : "Error: esperado MENOR, obtenido " + result1;
        System.out.println("✓ Test menor pasado");

        // Test mayor de edad
        String result2 = isAdult(18);
        System.out.println("isAdult(18) = " + result2);
        assert "MAYOR".equals(result2) : "Error: esperado MAYOR, obtenido " + result2;
        System.out.println("✓ Test mayor pasado");

        // Test edad negativa -> IllegalArgumentException
        try {
            isAdult(-1);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para edad negativa");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test edad negativa lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

