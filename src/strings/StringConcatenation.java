package strings;

public class StringConcatenation {
    public static void main(String[] args) {
        {
            // Creating two string literals
            String s1 = "ing";
            String s2 = s1;

            // Creates a new object "ingforing"
            // Now s1 points to this new string
            s1 = s1 + "foring";
            // or
            // s1 = s1.concat("foring");

            System.out.println(s1);

            // Since s2 is still pointing 
            // to initial "ing"
            // and s1 is pointing to a new 
            // object "ingforing"
            System.out.println(s1 == s2);
        }
    }
}