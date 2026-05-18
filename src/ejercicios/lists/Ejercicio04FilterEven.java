package ejercicios.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * EJERCICIO 4 - Filtrar pares (List -> List)
 * ------------------------------------------------------------
 * Dada una lista de enteros, devuelve una NUEVA lista con solo los números pares.
 * Mantén el orden original.
 * Reglas:
 *  - Si input es null -> IllegalArgumentException
 */
public class Ejercicio04FilterEven {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para filtrar los números pares de la lista.
     * @param input lista de enteros
     * @return nueva lista con solo los números pares
     */
    public static List<Integer> filterEven(List<Integer> input) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: filterEven");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio04FilterEven ===");
        
        // Test caso normal
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = filterEven(input);
        List<Integer> expected = List.of(2, 4, 6);
        System.out.println("filterEven(" + input + ") = " + result);
        assert result.equals(expected) : "Error: esperado " + expected + ", obtenido " + result;
        System.out.println("✓ Test caso normal pasado");

        // Test null -> IllegalArgumentException
        try {
            filterEven(null);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

