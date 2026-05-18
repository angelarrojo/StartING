package ejercicios.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * EJERCICIO 5 - Convertir array a lista
 * ------------------------------------------------------------
 * Dado un array de ints, devuelve una List<Integer> con los mismos valores.
 * Reglas:
 *  - Si input es null -> IllegalArgumentException
 */
public class Ejercicio05ToList {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para convertir un array de enteros en una lista.
     * @param input array de enteros
     * @return lista con los mismos valores
     */
    public static List<Integer> toList(int[] input) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: toList");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio05ToList ===");
        
        // Test caso normal
        int[] input = {1, 2, 3};
        List<Integer> result = toList(input);
        List<Integer> expected = List.of(1, 2, 3);
        System.out.println("toList(" + Arrays.toString(input) + ") = " + result);
        assert result.equals(expected) : "Error: esperado " + expected + ", obtenido " + result;
        System.out.println("✓ Test caso normal pasado");

        // Test null -> IllegalArgumentException
        try {
            toList(null);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

