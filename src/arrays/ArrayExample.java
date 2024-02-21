package arrays;

import java.util.ArrayList;

public class ArrayExample {

    public static void main(String[] args) {

        //ArrayList: data structure, dynamically sized
        //"old school arrays": arrays: []: fixed size

        String[] sky = new String[4];
        sky[0] = "Polaris";//0
        sky[1] = "The Sun";//1
        sky[2] = "Betelgeuse"; //2
        sky[3] = "Vega";    //3

        for (String star : sky) {
            System.out.println(star);
        }


    }

}
