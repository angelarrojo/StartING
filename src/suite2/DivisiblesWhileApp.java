package suite2;

public class DivisiblesWhileApp {
    public static void main(String[] args) {

        int num=1;

        //Definimos el bucle, incluye el 100
        while (num<=100){
            if (num%2==0 || num%3==0){
                System.out.println(num);
            }
            //Incrementamos num
            num++;
        }
    }
}
