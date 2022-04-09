package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {

        //create and print char array
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));

        //print size of array with a message
        System.out.println("The size of the array is = " + chars.length);

        //print each element using fori loop
        for (int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }

        //other way
        for (char c : chars){
            System.out.println(c);
        }

        //print only the letters
        for (int i = 0; i < chars.length; i++){
            if (utilities.CharacterHelper.isLetter(chars[i])){
                System.out.println(chars[i]);
            }
        }

        //count how many are uppercase
        int num = 0;
        for (int i = 0; i < chars.length; i++){
            if (Character.isUpperCase(chars[i])){
                num += 1;
            }
        }
        System.out.println("You have " + num + " uppercase letters");

    }
}
