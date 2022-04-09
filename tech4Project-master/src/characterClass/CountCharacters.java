package characterClass;

import com.sun.security.jgss.GSSUtil;
import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {

        /*
            TASK-1
            Write a program that counts spaces, then letters, for below String:
            String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

            Expected result:
            9
        */

        System.out.println("\n---TASK-1---\n");
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int amountOfSpaces = 0, amountOfLetters = 0;
        for (int i = 0; i <= address.length()-1; i++){
            if (address.charAt(i) == ' '){
                amountOfSpaces += 1;
            }if (CharacterHelper.isLetter(address.charAt(i))){
                amountOfLetters += 1;
            }
        }
        System.out.println("This string has " + amountOfSpaces + " spaces");
        System.out.println("This string has " + amountOfLetters + " Letters");

        System.out.println("\nTask2\n");

        int numOfVowel = 0;
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == 'a' || address.charAt(i) == 'A' || address.charAt(i) == 'e' || address.charAt(i) == 'E'||
                    address.charAt(i) == 'I'|| address.charAt(i) == 'i'|| address.charAt(i) == 'o' || address.charAt(i) == 'O' ||
                    address.charAt(i) == 'u'|| address.charAt(i) == 'U'){
                 numOfVowel += 1;
            }
        }
        System.out.println("This string has " + numOfVowel + " vowels");


    }
}
