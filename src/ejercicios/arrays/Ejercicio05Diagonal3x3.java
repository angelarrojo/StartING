package ejercicios.arrays;

import java.util.Arrays;

/**
 * EJERCICIO 5 - Matriz 3x3 y diagonal
 * ------------------------------------------------------------
 * Crea una matriz 3x3 (int[][]) rellena con números consecutivos empezando en 1,
 * y devuelve un array con la diagonal principal.
 *
 * La matriz quedaría así:
 *  1 2 3
 *  4 5 6
 *  7 8 9
 * Diagonal: [1,5,9]
 */
public class Ejercicio05Diagonal3x3 {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para crear una matriz 3x3 con números consecutivos
     * y devolver su diagonal principal.
     * @return array con la diagonal principal [1, 5, 9]
     */
    public static int[] diagonal3x3() {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: diagonal3x3");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio05Diagonal3x3 ===");
        
        // Test caso normal
        int[] expected = {1, 5, 9};
        int[] result = diagonal3x3();
        System.out.println("diagonal3x3() = " + Arrays.toString(result));
        assert Arrays.equals(result, expected) : "Error: esperado " + Arrays.toString(expected) + ", obtenido " + Arrays.toString(result);
        System.out.println("✓ Test diagonal correcta pasado");

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

