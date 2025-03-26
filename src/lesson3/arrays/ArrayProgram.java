package lesson3.arrays;

import java.util.Arrays;

public class ArrayProgram {

    public static void main(String[] args) {

        //Creation
        int[] intArray = {};
        int[] intArray2 = new int[]{1,2};
        int[] intArray3 = new int[10];

        char[] characters = "Hello".toCharArray();
        String[] words = {"Hello", "there"};

        //Visualization
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println(Arrays.toString(characters));
        System.out.println(Arrays.toString(words));

        //Get element at index
        System.out.println(words[0]);

        //Update element at index
        words[0] = "Bye";
        System.out.println(Arrays.toString(words));

        // Array Length
        System.out.println(intArray3.length);

        // Traverse an array
        for (int i = 0; i < intArray3.length; i++) {
            intArray3[i] = i;
        }
        System.out.println(Arrays.toString(intArray3));

        //For each loop
        for (int number : intArray3) {
            System.out.println(number);
        }

    }
}
