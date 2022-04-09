package loops;

import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you would like to add");
        int amount = input.nextInt();
        int times = 1;
        int sum = 0;
        while(amount >= times){
            System.out.println("Please enter number " + times++);
            int num = input.nextInt();
            sum += num;
        }
        System.out.println("Sum of numbers is = " + sum);




    }
}
