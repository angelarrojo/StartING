package strings;

public class StringExample {
    public static void main(String[] args) {
        String name = "starting";

        //Geeting the string of the string
        System.out.println(name.length());

        //Geeting the index of a string 
        System.out.println(name.charAt(3));

        //Geeting the sub string of a string
        System.out.println(name.substring(2));

        //Geeting sub string of a range 
        System.out.println(name.substring(1,4));
    }
}
