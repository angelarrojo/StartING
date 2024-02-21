package strings;

public class StringReferenceCompare {
    public static void main(String[] args) {
        // Creating two string literals
        String s1 = "ing";
        String s2 = "ing";
        
        // Checking if both point to the
        // same object or not
        if(s1 == s2)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        // Creating a string using 
        // new operator
        String s3 = new String("ing");
        
        // Checking if both point to the
        // same object or not
        if(s1 == s3)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(s1.equals(s2));
    } 
}
