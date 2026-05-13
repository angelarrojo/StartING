package ejercicios.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * EJERCICIO 1 - Crear y modificar lista
 * ------------------------------------------------------------
 * Crea una lista vacía de Strings, añade 3 nombres y elimina el segundo.
 * Devuelve la lista resultante.
 *
 * Ejemplo (si añades ["Ana","Luis","Marta"]): devuelve ["Ana","Marta"].
 */
public class Ejercicio01AddThreeRemoveSecond {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para crear una lista con 3 nombres y eliminar el segundo.
     * @param a primer nombre
     * @param b segundo nombre (será eliminado)
     * @param c tercer nombre
     * @return lista con el primer y tercer nombre
     */
    public static List<String> addThreeRemoveSecond(String a, String b, String c) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: addThreeRemoveSecond");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio01AddThreeRemoveSecond ===");
        
        // Test caso normal
        List<String> result = addThreeRemoveSecond("Ana", "Luis", "Marta");
        List<String> expected = List.of("Ana", "Marta");
        System.out.println("addThreeRemoveSecond(\"Ana\", \"Luis\", \"Marta\") = " + result);
        assert result.equals(expected) : "Error: esperado " + expected + ", obtenido " + result;
        System.out.println("✓ Test caso normal pasado");

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

