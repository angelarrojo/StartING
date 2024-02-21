package strings;

public class BetterLeftMostNonRepeatEle {
    static final int CHAR = 256;

    public static int nonRepeat(String world){
        int count[] = new int[CHAR];    
        for(int i = 0; i < world.length(); i++){
            count[world.charAt(i)]++;
        }
        for(int i = 0; i < world.length(); i++){
            if(count[world.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String name = "ingforing";
        System.out.println("Index of left most non repeating element");
        System.out.println(nonRepeat(name));
    }
}
