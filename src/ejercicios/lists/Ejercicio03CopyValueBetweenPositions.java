package ejercicios.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * EJERCICIO 3 - Sustituir elemento
 * ------------------------------------------------------------
 * Dada una lista de Strings y dos índices (fromIndex, toIndex),
 * copia el valor de fromIndex a toIndex (equivalente a set(toIndex, get(fromIndex))).
 * Devuelve la lista modificada.
 * Reglas:
 *  - Si lista es null -> IllegalArgumentException
 *  - Si índices fuera de rango -> IndexOutOfBoundsException (deja que Java la lance)
 */
public class Ejercicio03CopyValueBetweenPositions {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para copiar el valor de una posición a otra.
     * @param list lista de strings
     * @param fromIndex índice origen
     * @param toIndex índice destino
     * @return la lista modificada
     */
    public static List<String> copyValueBetweenPositions(List<String> list, int fromIndex, int toIndex) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: copyValueBetweenPositions");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio03CopyValueBetweenPositions ===");
        
        // Test caso normal
        List<String> input = new ArrayList<>(List.of("a", "b", "c"));
        List<String> result = copyValueBetweenPositions(input, 0, 2);
        List<String> expected = List.of("a", "b", "a");
        System.out.println("copyValueBetweenPositions([\"a\",\"b\",\"c\"], 0, 2) = " + result);
        assert result.equals(expected) : "Error: esperado " + expected + ", obtenido " + result;
        System.out.println("✓ Test caso normal pasado");

        // Test null -> IllegalArgumentException
        try {
            copyValueBetweenPositions(null, 0, 1);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

