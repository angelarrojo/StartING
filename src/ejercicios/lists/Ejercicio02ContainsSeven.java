package ejercicios.lists;

import java.util.Arrays;
import java.util.List;

/**
 * EJERCICIO 2 - Buscar elemento
 * ------------------------------------------------------------
 * Dada una lista de enteros, devuelve true si contiene el número 7.
 * Reglas:
 *  - Si la lista es null -> IllegalArgumentException
 */
public class Ejercicio02ContainsSeven {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para verificar si la lista contiene el número 7.
     * @param numbers lista de enteros
     * @return true si contiene el 7, false en caso contrario
     */
    public static boolean containsSeven(List<Integer> numbers) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: containsSeven");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio02ContainsSeven ===");
        
        // Test contiene 7
        List<Integer> input1 = Arrays.asList(1, 2, 7, 9);
        boolean result1 = containsSeven(input1);
        System.out.println("containsSeven(" + input1 + ") = " + result1);
        assert result1 : "Error: esperado true, obtenido " + result1;
        System.out.println("✓ Test contiene 7 pasado");

        // Test no contiene 7
        List<Integer> input2 = Arrays.asList(1, 2, 3);
        boolean result2 = containsSeven(input2);
        System.out.println("containsSeven(" + input2 + ") = " + result2);
        assert !result2 : "Error: esperado false, obtenido " + result2;
        System.out.println("✓ Test no contiene 7 pasado");

        // Test null -> IllegalArgumentException
        try {
            containsSeven(null);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

