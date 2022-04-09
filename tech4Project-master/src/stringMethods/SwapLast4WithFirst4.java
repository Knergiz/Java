package stringMethods;

import java.util.Scanner;

public class SwapLast4WithFirst4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String word = input.nextLine();

        if (word.length() < 8){
            System.out.println("This string does not have 8 characters");
        }else{
            String first4 = word.substring(0, 4);
            String last4 = word.substring(word.length()-4);
            String middle = word.substring(4, word.length()-4);

            System.out.println(last4 + middle + first4);

        }




    }
}
