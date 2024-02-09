package suite1;

import java.util.Scanner;
public class IntroducePassword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String contraseña="eureka";

        final int INTENTOS = 3;

        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
        boolean acierto=false;

        String password;
        for (int i=0;i<INTENTOS && !acierto;i++){
            System.out.println("Introduce una contraseña");
            password = sc.next();

            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contraseña)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
        }
    }
}
