package homeworks;
import java.util.Scanner;
public class Homework11 {
    public static void main(String[] args) {

        //task1
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0){
                System.out.print(i + " - ");
            }
        }
        System.out.println("\n");

        //task2
        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0 && i % 3 == 0){
                System.out.print(i + " - ");
            }
        }
        System.out.println("\n");

        //task3
        for (int i = 100; i >= 50; i--){
            if (i % 5 ==0){
                System.out.print(i + " - ");
            }
        }
        System.out.println("\n");

        //task4
        for (int i = 0; i <= 7; i++) System.out.println(i * i);
        System.out.println("\n");

        //task5
        int sum = 0;
        for (int i = 1; i <= 10; i++) sum += i;
        System.out.println(sum);
        System.out.println("\n");

        //task6
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number:");
        int num = input.nextInt();
        int factor = 1;
        if (num >= 0 ){
            for (int i = 1; num >= i; i++){
                factor *= i;
            }
            System.out.println(factor);
        }else System.out.println("Number entered is not positive");
        System.out.println("\n");

        //task7
        System.out.println("Please enter your full name:");
        input.nextLine();
        String fullName = input.nextLine();
        int amount = 0;
        for (int i = 1; i <= fullName.length()-1; i++){
            if (fullName.charAt(i) == 'a') amount += 1;
            if (fullName.charAt(i) == 'e') amount += 1;
            if (fullName.charAt(i) == 'i') amount += 1;
            if (fullName.charAt(i) == 'o') amount += 1;
            if (fullName.charAt(i) == 'u') amount += 1;
            if (fullName.charAt(i) == 'A') amount += 1;
            if (fullName.charAt(i) == 'E') amount += 1;
            if (fullName.charAt(i) == 'I') amount += 1;
            if (fullName.charAt(i) == 'O') amount += 1;
            if (fullName.charAt(i) == 'U') amount += 1;
        }
        System.out.println("Your name has " + amount + " vowels");
        System.out.println("\n");

        //task8
        int sumOfEntered = 0;

        while (sumOfEntered < 100){
            System.out.println("Please enter a number:");
            int userNum = input.nextInt();
            if (userNum < 100){
                sumOfEntered += userNum;
                System.out.println("Total is now: " + sumOfEntered);
            }else System.out.println("Number entered is already more than or equal to 100");
        }
        System.out.println("Sum of entered numbers is at least 100\n\n");

        //task9
        int fib = 5;
        int num1 = 0, num2 = 1;
        for (int i = 1; i <= fib; i++){
            System.out.print(num1 + " - ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("\n");

        //task10
        System.out.println("Please enter a name:");
        String name = input.nextLine();
        input.next();
        while (name.substring(0,1) != "j" && name.substring(0,1) != "J"){
            System.out.println("Please enter a name:");
            name = input.nextLine();
        }
        System.out.println("Name ends with \"j\" or \"J\"");
        System.out.println("\nEnd of program");











    }
}
