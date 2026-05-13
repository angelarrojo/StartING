package ejercicios.conditionals;

/**
 * SWITCH 4 - Calculadora por operador
 * ------------------------------------------------------------
 * Dado (a, b, op) devuelve:
 *  op '+' -> a + b
 *  op '-' -> a - b
 *  op '*' -> a * b
 *  op '/' -> a / b (división entera)
 *
 * Reglas:
 *  - Si op no es válido -> IllegalArgumentException
 *  - Si op es '/' y b==0 -> ArithmeticException
 */
public class Ejercicio09Calculate {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para realizar la operación indicada.
     * @param a primer operando
     * @param b segundo operando
     * @param op operador ('+', '-', '*', '/')
     * @return resultado de la operación
     */
    public static int calculate(int a, int b, char op) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: calculate");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio09Calculate ===");
        
        // Test suma
        int result1 = calculate(2, 3, '+');
        System.out.println("calculate(2, 3, '+') = " + result1);
        assert result1 == 5 : "Error: esperado 5, obtenido " + result1;
        System.out.println("✓ Test suma pasado");

        // Test resta
        int result2 = calculate(2, 3, '-');
        System.out.println("calculate(2, 3, '-') = " + result2);
        assert result2 == -1 : "Error: esperado -1, obtenido " + result2;
        System.out.println("✓ Test resta pasado");

        // Test multiplicación
        int result3 = calculate(2, 3, '*');
        System.out.println("calculate(2, 3, '*') = " + result3);
        assert result3 == 6 : "Error: esperado 6, obtenido " + result3;
        System.out.println("✓ Test multiplicación pasado");

        // Test división
        int result4 = calculate(7, 3, '/');
        System.out.println("calculate(7, 3, '/') = " + result4);
        assert result4 == 2 : "Error: esperado 2, obtenido " + result4;
        System.out.println("✓ Test división pasado");

        // Test operador inválido
        try {
            calculate(1, 1, '?');
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para operador inválido");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test operador inválido lanza IllegalArgumentException correctamente");
        }

        // Test división por cero
        try {
            calculate(1, 0, '/');
            System.out.println("✗ Error: debería lanzar ArithmeticException para división por cero");
        } catch (ArithmeticException e) {
            System.out.println("✓ Test división por cero lanza ArithmeticException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

