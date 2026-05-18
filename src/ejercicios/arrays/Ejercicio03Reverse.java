package ejercicios.arrays;

import java.util.Arrays;

/**
 * EJERCICIO 3 - Invertir array
 * ------------------------------------------------------------
 * Dado un array de enteros, devuelve otro array con los mismos valores pero en orden inverso.
 * Ejemplo: [1,2,3,4,5] -> [5,4,3,2,1]
 * Reglas:
 *  - Si input es null -> IllegalArgumentException
 *  - No modificar el array original
 */
public class Ejercicio03Reverse {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para devolver un nuevo array con los elementos en orden inverso.
     * @param input array de enteros
     * @return nuevo array con los elementos invertidos
     */
    public static int[] reverse(int[] input) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: reverse");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio03Reverse ===");
        
        // Test caso normal
        int[] input1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 4, 3, 2, 1};
        int[] result1 = reverse(input1);
        System.out.println("reverse(" + Arrays.toString(input1) + ") = " + Arrays.toString(result1));
        assert Arrays.equals(result1, expected1) : "Error: esperado " + Arrays.toString(expected1) + ", obtenido " + Arrays.toString(result1);
        System.out.println("✓ Test caso normal pasado");

        // Test que no modifica el array original
        int[] original = {1, 2, 3, 4, 5};
        assert Arrays.equals(input1, original) : "Error: el array original fue modificado";
        System.out.println("✓ Test array original no modificado pasado");

        // Test null -> IllegalArgumentException
        try {
            reverse(null);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

