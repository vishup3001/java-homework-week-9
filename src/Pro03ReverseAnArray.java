import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Pro03ReverseAnArray {
    /*function reverses the elements of the array*/
    static void reverse(Integer myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }

    public static void main(String[] args)
    {
        Integer [] myArray = {45,83,2,-88,-3};
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray);
    }
}

