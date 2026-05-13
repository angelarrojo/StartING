package ejercicios.string;

public class Ejercicio00 {
    public static void main(String[] args) {

        // 1. Abre la documentación oficial de la clase String:
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        // Baja hasta la sección Method Summary

        // 2. Lee la lista de métodos públicos de la clase String.
        //    NO es necesario entenderlos todos, solo fíjate en:
        //    - qué nombre tienen
        Staticstring valueOf(boolean b)
        static String valueOf(char c)
        static String valueOf(char[] data)
        static String valueOf(char[] data, int offset, int count)
        static String valueOf(double d)
        static String valueOf(float f)
        static String valueOf(int i)
        static String valueOf(long l)
        static String valueOf(Object obj)
        //    - qué hacen (descripción corta)
        static String valueOf(char c) = te dice si es true or false el string
        static String valueOf(char c) = se convierte un char en un string
        static String valueOf(char[] data) = convierte un array de char a string
        static String valueOf(char[] data, int offset, int count) = convierte parte del array en string
        static String valueOf(double d) = Convierte un número decimal doble a String
        static String valueOf(float f) = Convierte un número decimal simple a String
        static String valueOf(int i) = Convierte un número entero a String
        static String valueOf(long l) = Convierte un número entero largo a String
        static String valueOf(Object obj) = Convierte cualquier objeto a String llamando su tostring()

        //    - qué tipo devuelven (return)
        static String valueOf(char c) = te devuelven el string representanto el boolean
        static String valueOf(char c) = te devuelven el string representanto el char
        static String valueOf(char[] data) = te devuelven el string representanto el char array
        static String valueOf(char[] data, int offset, int count) = te devuelven el string representanto un subrray especifico del char array
        static String valueOf(double d) = te devuelven el string representanto del doble
        static String valueOf(float f) = te devuelven el string representanto el float
        static String valueOf(int i) = te devuelven el string representanto el int
        static String valueOf(long l) = te devuelven el string representanto el long
        static String valueOf(Object obj) = te devuelven el string representanto el objecto
        // 3. Elige UN método de String que NO hayamos usado en clase.
        static String valueOf(char c)
        // 4. Escribe aquí el nombre del método elegido (solo como comentario)
        static String valueOf(char c)
        // 5. Explica con tus palabras qué hace ese método (solo un comentario, no código)
        te dice si es true or false el string
        // 6. Indica un ejemplo de uso del método (solo escribe qué resultado esperas, no hace falta que funcione)

        // IMPORTANTE:
        // - Este ejercicio NO es para ejecutar código
        // - Se evalúa que sepas buscar, leer y entender la API
        // - No copies la descripción literal de la web
    }
}