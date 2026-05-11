package ejercicios.string;

import java.util.ArrayList;
import java.util.List;

class
EjercicioHugoFernandez
{
    public static void main(String[] args) {

        System.out.println("Tu nombre es Hugo");

        int[] frutas1={1,2,3,4,5};
        System.out.println(frutas1[0]);
        System.out.println(frutas1[1]);
        System.out.println(frutas1[2]);
        System.out.println(frutas1[3]);
        System.out.println(frutas1[4]);

        int[] frutas2= new int[5];
        frutas2[0]= frutas1[4];
        frutas2[1]= frutas1[3];
        frutas2[2]= frutas1[2];
        frutas2[3]= frutas1[1];
        frutas2[4]= frutas1[0];

        System.out.println(frutas2[0]);
        System.out.println(frutas2[1]);
        System.out.println(frutas2[2]);
        System.out.println(frutas2[3]);
        System.out.println(frutas2[4]);


        List<Object> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Naranja");
        frutas.add("Manzana");
        frutas.remove("Manzana");
        System.out.println(frutas);


        System.out.println("Avanza");
    }
}
