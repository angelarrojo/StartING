package ejercicios.arrays;

import java.util.Arrays;

/**
 * EJERCICIO 1 - Acceso por índice
 * ------------------------------------------------------------
 * Dado un array de 5 enteros, devuelve el tercer elemento.
 * Reglas:
 *  - Si el array es null -> IllegalArgumentException
 *  - Si el array tiene menos de 3 elementos -> IllegalArgumentException
 */
public class Ejercicio01ThirdElement {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para devolver el tercer elemento del array.
     * @param numbers array de enteros
     * @return el tercer elemento (índice 2)
     */
    public static int thirdElement(int[] numbers) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: thirdElement");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio01ThirdElement ===");
        
        // Test caso normal
        int[] input1 = {10, 20, 30, 40, 50};
        int expected1 = 30;
        int result1 = thirdElement(input1);
        System.out.println("thirdElement(" + Arrays.toString(input1) + ") = " + result1);
        assert result1 == expected1 : "Error: esperado " + expected1 + ", obtenido " + result1;
        System.out.println("✓ Test caso normal pasado");

        // Test null -> IllegalArgumentException
        try {
            thirdElement(null);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        // Test array con menos de 3 elementos
        try {
            thirdElement(new int[]{1, 2});
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para array pequeño");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test array pequeño lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

