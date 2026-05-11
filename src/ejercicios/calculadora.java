package ejercicios;

public class calculadora {
    // Método para suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método para resta
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicación
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para división
    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre 0");
            return 0;
        }
        return (double) a / b;
    }

    // Método con operación seleccionada
    public static double calcular(int a, int b, String operacion) {
        switch (operacion.toLowerCase()) {
            case "suma":
            case "+":
                return sumar(a, b);
            case "resta":
            case "-":
                return restar(a, b);
            case "multiplicacion":
            case "*":
                return multiplicar(a, b);
            case "division":
            case "/":
                return dividir(a, b);
            default:
                System.out.println("Operación no válida");
                return 0;
        }
    }

    // Método main para probar la calculadora
    public static void main(String[] args) {
        System.out.println("--- CALCULADORA ---");

        // Ejemplos con números pequeños
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + " + " + num2 + " = " + sumar(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + restar(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));

        System.out.println("\n--- Usando método calcular ---");
        System.out.println("Suma: " + calcular(10, 3, "suma"));
        System.out.println("Resta: " + calcular(10, 3, "resta"));
        System.out.println("Multiplicación: " + calcular(8, 3, "*"));
        System.out.println("División: " + calcular(12, 3, "/"));
    }
}

