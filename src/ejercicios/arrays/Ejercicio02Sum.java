package ejercicios.arrays;

import java.util.Arrays;

/**
 * EJERCICIO 2 - Suma de elementos
 * ------------------------------------------------------------
 * Dado un array de doubles, devuelve la suma de todos sus elementos.
 * Reglas:
 *  - Si el array es null -> IllegalArgumentException
 *  - Si el array está vacío -> devuelve 0.0
 */
public class Ejercicio02Sum {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para devolver la suma de todos los elementos del array.
     * @param values array de doubles
     * @return la suma de todos los elementos
     */
    public static double sum(double[] values) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: sum");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio02Sum ===");
        
        // Test caso normal
        double[] input1 = {2.5, 3.6, 4.7};
        double expected1 = 10.8;
        double result1 = sum(input1);
        System.out.println("sum(" + Arrays.toString(input1) + ") = " + result1);
        assert Math.abs(result1 - expected1) < 1e-9 : "Error: esperado " + expected1 + ", obtenido " + result1;
        System.out.println("✓ Test caso normal pasado");

        // Test array vacío
        double[] input2 = {};
        double expected2 = 0.0;
        double result2 = sum(input2);
        System.out.println("sum(" + Arrays.toString(input2) + ") = " + result2);
        assert Math.abs(result2 - expected2) < 1e-9 : "Error: esperado " + expected2 + ", obtenido " + result2;
        System.out.println("✓ Test array vacío pasado");

        // Test null -> IllegalArgumentException
        try {
            sum(null);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

