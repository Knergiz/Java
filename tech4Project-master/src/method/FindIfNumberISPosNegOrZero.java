package method;
import utilities.MathHelper;

import java.util.Scanner;
public class FindIfNumberISPosNegOrZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num1 = input.nextInt();

        if (MathHelper.isPositive(num1)){
            System.out.println("The number is positive");
        }else if (MathHelper.isNegative(num1)){
            System.out.println("The number is negative");
        }else System.out.println("The number is zero");





    }
}
