package ejercicios.arrays;

import java.util.Arrays;

/**
 * EJERCICIO 4 - Filtrado (pares y > 25)
 * ------------------------------------------------------------
 * Teniendo un array (vector) de enteros con los valores que queramos,
 * devuelve OTRO array con aquellos elementos que cumplan:
 *  - Ser pares
 *  - Ser mayores que 25
 *
 * Reglas:
 *  - Mantener el orden original
 *  - Si no hay coincidencias, devolver array vacío
 *  - Si input es null -> IllegalArgumentException
 */
public class Ejercicio04FilterEvenGreaterThan25 {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para filtrar los elementos que sean pares y mayores que 25.
     * @param input array de enteros
     * @return nuevo array con los elementos que cumplen las condiciones
     */
    public static int[] filterEvenAndGreaterThan25(int[] input) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: filterEvenAndGreaterThan25");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio04FilterEvenGreaterThan25 ===");
        
        // Test caso normal
        int[] input1 = {10, 26, 27, 50, 12, 28};
        int[] expected1 = {26, 50, 28};
        int[] result1 = filterEvenAndGreaterThan25(input1);
        System.out.println("filterEvenAndGreaterThan25(" + Arrays.toString(input1) + ") = " + Arrays.toString(result1));
        assert Arrays.equals(result1, expected1) : "Error: esperado " + Arrays.toString(expected1) + ", obtenido " + Arrays.toString(result1);
        System.out.println("✓ Test caso normal pasado");

        // Test sin coincidencias
        int[] input2 = {1, 3, 5, 25};
        int[] expected2 = {};
        int[] result2 = filterEvenAndGreaterThan25(input2);
        System.out.println("filterEvenAndGreaterThan25(" + Arrays.toString(input2) + ") = " + Arrays.toString(result2));
        assert Arrays.equals(result2, expected2) : "Error: esperado " + Arrays.toString(expected2) + ", obtenido " + Arrays.toString(result2);
        System.out.println("✓ Test sin coincidencias pasado");

        // Test null -> IllegalArgumentException
        try {
            filterEvenAndGreaterThan25(null);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

