package homeworks;
import java.util.Scanner;
import utilities.MathHelper;

public class Homework08 {
    public static void main(String[] args) {

        //task1
        int rndm = MathHelper.RandomNumberGenerator.getRandomNumber(0, 50);

        if ((rndm >= 10) && (rndm <= 25)){
            System.out.println(rndm + " is between 10 and 25");
        }else{
            System.out.println(rndm + " is not between 10 and 25\n");
        }

        //task2
        int random = MathHelper.RandomNumberGenerator.getRandomNumber(1, 100);

        if (random < 50){
            System.out.println(random + " is in the 1st half");
        }else{
            System.out.println(random + " is in the 2nd half");
        }

        if (random <= 25){
            System.out.println(random + " is in the 1st quarter");
        }else if ((random >= 26) && (random <= 50)){
            System.out.println(random + " is in the 2nd quarter");
        }else if ((random >= 51) && (random <= 75)){
            System.out.println(random + " is in the 3rd quarter");
        }else{
            System.out.println(random + " is in the 4th quarter");
        }

        //task3
        Scanner inputdata = new Scanner(System.in);

        System.out.println("\nPlease enter 5 numbers between 1 and 10 (both included): ");
        int num1 = inputdata.nextInt();
        int num2 = inputdata.nextInt();
        int num3 = inputdata.nextInt();
        int num4 = inputdata.nextInt();
        int num5 = inputdata.nextInt();

        if ((num1 >= 1) && (num1 <= 10)){
            num1 *= 5;
        }
        if ((num2 >= 1) && (num2 <= 10)){
            num2 *= 4;
        }
        if ((num3 >= 1) && (num3 <= 10)){
            num3 *= 3;
        }
        if ((num4 >= 1) && (num4 <= 10)){
            num4 *= 2;
        }
        System.out.println((num1 + num2 + num3 + num4 + num5) + "\n");

    }
}
