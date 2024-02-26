package metodos;

import java.util.Arrays;

public class Invertir {
    public static void main(String[] args) {

        int[] miarray = {1,2,3,4,5};
        System.out.println("mi array invertido es es : " + invertir(miarray).toString());

        //System.out.println("mi array invertido es es : " + Arrays.toString(invertir(miarray)));
    }
    public static int[] invertir(int[] invierteme) {
        int retornar[] = new int[invierteme.length];
        for (int i=invierteme.length-1,j=0; i>=0; i--, j++){
            retornar[j] = invierteme[i];
        }
        return retornar;
    }
}