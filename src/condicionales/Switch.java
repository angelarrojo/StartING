package condicionales;

public class Switch {
    public static void main(String[] args) {

        int miposicion = 3;
        //OJO A LOS BREAKS
        switch (miposicion) {
            case 1:
                System.out.println("soy oro");
                //break;
            case 2:
                System.out.println("soy plata");
            case 3:
                System.out.println("soy bronce");
            default:
                System.out.println("participar es lo importante");
        }
    }
}