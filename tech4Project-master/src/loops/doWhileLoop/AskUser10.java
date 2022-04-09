package loops.doWhileLoop;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while (num < 10){
            System.out.println("This number is not more than or equal to 10\n");
            System.out.println("Please enter a new number:");
            num = input.nextInt();
        }
        System.out.println("This number is more than or equal to 10");



    }
}
