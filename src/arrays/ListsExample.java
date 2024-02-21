package arrays;

import java.util.ArrayList;

public class ListsExample {
    public static void main(String[] args) {

        //ArrayList: data structure, dynamically sized
        //"old school arrays": arrays: []: fixed size

        ArrayList<Star> sky = new ArrayList<>();
        sky.add(new Star("Polaris"));//0
        sky.add(new Star("The Sun"));//1
        sky.add(new Star("Betelgeuse")); //2
        sky.add(new Star("Vega"));    //3

        for (Star star : sky) {
            System.out.println(star);
        }


    }

    private static class Star {
        public Star(String name) {
        }
    }

}
