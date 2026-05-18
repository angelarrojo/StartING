package ejercicios.conditionals;

/**
 * SWITCH 3 - Menú simple
 * ------------------------------------------------------------
 * Dada una opción (char):
 *  'A' -> "ALTA"
 *  'B' -> "BAJA"
 *  'C' -> "CONSULTA"
 *  'S' -> "SALIR"
 * Cualquier otro -> "OPCION_INVALIDA"
 * 
 * Nota: debería funcionar tanto con mayúsculas como minúsculas.
 */
public class Ejercicio08MenuAction {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para devolver la acción del menú según la opción.
     * @param option carácter de la opción
     * @return acción correspondiente
     */
    public static String menuAction(char option) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: menuAction");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio08MenuAction ===");
        
        // Test ALTA
        String result1 = menuAction('A');
        System.out.println("menuAction('A') = " + result1);
        assert "ALTA".equals(result1) : "Error: esperado ALTA, obtenido " + result1;
        System.out.println("✓ Test 'A' pasado");

        // Test BAJA (minúscula)
        String result2 = menuAction('b');
        System.out.println("menuAction('b') = " + result2);
        assert "BAJA".equals(result2) : "Error: esperado BAJA, obtenido " + result2;
        System.out.println("✓ Test 'b' pasado");

        // Test CONSULTA
        String result3 = menuAction('C');
        System.out.println("menuAction('C') = " + result3);
        assert "CONSULTA".equals(result3) : "Error: esperado CONSULTA, obtenido " + result3;
        System.out.println("✓ Test 'C' pasado");

        // Test SALIR (minúscula)
        String result4 = menuAction('s');
        System.out.println("menuAction('s') = " + result4);
        assert "SALIR".equals(result4) : "Error: esperado SALIR, obtenido " + result4;
        System.out.println("✓ Test 's' pasado");

        // Test opción inválida
        String result5 = menuAction('x');
        System.out.println("menuAction('x') = " + result5);
        assert "OPCION_INVALIDA".equals(result5) : "Error: esperado OPCION_INVALIDA, obtenido " + result5;
        System.out.println("✓ Test opción inválida pasado");

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

