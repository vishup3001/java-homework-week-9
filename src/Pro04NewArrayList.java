import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */
public class Pro04NewArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Black");
        colors.add("yellow");
        colors.add("White");
        colors.add("Grey");
        colors.add("Yellow");
        System.out.println(colors.toString());
    }

}
