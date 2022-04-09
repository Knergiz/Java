package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        //sort an array of numbers (ascending)
        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //sort an array of characters (alphabetical)
        char[] characters = {'A', 'b', 'z', 'H'};
        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));
        //sorts uppercase first, then lowercase

        //sort an array of strings (alphabetical)
        String[] names = {"Adam", "Alex", "tom", "ally", "Adele", "terry"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));




    }
}
