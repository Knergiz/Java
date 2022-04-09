package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        // create scanner, ask user questions, gather data
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num1 = input.nextInt();
        System.out.println("Please enter another number:");
        int num2 = input.nextInt();

        // create variable for min and max to simplify for myself
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        //create loop statement
        for (int i = min; i <= max; i++){
            System.out.println(i);
        }


    }
}
