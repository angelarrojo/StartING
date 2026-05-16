package ejercicios.conditionals;

/**
 * SWITCH 5 - Semáforo
 * ------------------------------------------------------------
 * Dado un color (String) devuelve qué hacer:
 *  "ROJO" -> "PARAR"
 *  "AMARILLO" -> "PRECAUCION"
 *  "VERDE" -> "AVANZAR"
 * Si color es null -> IllegalArgumentException
 * Si no coincide -> "DESCONOCIDO"
 * 
 * Nota: debería funcionar ignorando mayúsculas/minúsculas y espacios al inicio/final.
 */
public class Ejercicio10TrafficLight {

    public static void main(String[] args) {
        test();
    }

    /**
     * Implementa este método para devolver la acción según el color del semáforo.
     * @param color color del semáforo
     * @return acción a realizar
     */
    public static String trafficLight(String color) {
        // TODO: implementa este método
        throw new UnsupportedOperationException("TODO: trafficLight");
    }

    /**
     * Método de test que verifica la implementación.
     */
    public static void test() {
        System.out.println("=== Test Ejercicio10TrafficLight ===");
        
        // Test ROJO
        String result1 = trafficLight("ROJO");
        System.out.println("trafficLight(\"ROJO\") = " + result1);
        assert "PARAR".equals(result1) : "Error: esperado PARAR, obtenido " + result1;
        System.out.println("✓ Test ROJO pasado");

        // Test amarillo con espacios y minúsculas
        String result2 = trafficLight(" amarillo ");
        System.out.println("trafficLight(\" amarillo \") = " + result2);
        assert "PRECAUCION".equals(result2) : "Error: esperado PRECAUCION, obtenido " + result2;
        System.out.println("✓ Test amarillo con espacios pasado");

        // Test verde minúsculas
        String result3 = trafficLight("verde");
        System.out.println("trafficLight(\"verde\") = " + result3);
        assert "AVANZAR".equals(result3) : "Error: esperado AVANZAR, obtenido " + result3;
        System.out.println("✓ Test verde minúsculas pasado");

        // Test color desconocido
        String result4 = trafficLight("azul");
        System.out.println("trafficLight(\"azul\") = " + result4);
        assert "DESCONOCIDO".equals(result4) : "Error: esperado DESCONOCIDO, obtenido " + result4;
        System.out.println("✓ Test color desconocido pasado");

        // Test null
        try {
            trafficLight(null);
            System.out.println("✗ Error: debería lanzar IllegalArgumentException para null");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Test null lanza IllegalArgumentException correctamente");
        }

        System.out.println("=== Todos los tests pasados ===\n");
    }
}

