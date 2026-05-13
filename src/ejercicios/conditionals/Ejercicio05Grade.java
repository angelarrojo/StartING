package ejercicios.conditionals;

/**
 * IF/ELSE 5 - Clasificación de nota
 * ------------------------------------------------------------
 * Dado un score de 0 a 100, devuelve:
 *  - "SUSPENSO" (0-49)
 *  - "APROBADO" (50-69)
 *  - "NOTABLE" (70-89)
 *  - "SOBRESALIENTE" (90-100)
 * Si score fuera de rango -> IllegalArgumentException
 */
public class Ejercicio05Grade {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para clasificar una nota.
     * @param score puntuación de 0 a 100
     * @return clasificación de la nota
     */
    public static String grade(int score) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: grade");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio05Grade ===");
        
        // Test suspenso
        assert "SUSPENSO".equals(grade(0)) : "Error: 0 debería ser SUSPENSO";
        assert "SUSPENSO".equals(grade(49)) : "Error: 49 debería ser SUSPENSO";
        System.out.println("grade(0) = " + grade(0));
        System.out.println("grade(49) = " + grade(49));
        System.out.println("✓ Test suspenso pasado");

        // Test aprobado
        assert "APROBADO".equals(grade(50)) : "Error: 50 debería ser APROBADO";
        assert "APROBADO".equals(grade(69)) : "Error: 69 debería ser APROBADO";
        System.out.println("grade(50) = " + grade(50));
        System.out.println("grade(69) = " + grade(69));
        System.out.println("✓ Test aprobado pasado");

        // Test notable
        assert "NOTABLE".equals(grade(70)) : "Error: 70 debería ser NOTABLE";
        assert "NOTABLE".equals(grade(89)) : "Error: 89 debería ser NOTABLE";
        System.out.println("grade(70) = " + grade(70));
        System.out.println("grade(89) = " + grade(89));
        System.out.println("✓ Test notable pasado");

        // Test sobresaliente
        assert "SOBRESALIENTE".equals(grade(90)) : "Error: 90 debería ser SOBRESALIENTE";
        assert "SOBRESALIENTE".equals(grade(100)) : "Error: 100 debería ser SOBRESALIENTE";
        System.out.println("grade(90) = " + grade(90));
        System.out.println("grade(100) = " + grade(100));
        System.out.println("✓ Test sobresaliente pasado");

        // Test fuera de rango
        try {
            grade(-1);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para -1");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test -1 lanza IllegalArgumentException correctamente");
        }

        try {
            grade(101);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para 101");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test 101 lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

