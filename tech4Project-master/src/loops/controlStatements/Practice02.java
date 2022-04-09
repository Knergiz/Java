package loops.controlStatements;
import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {

        // create scanner, ask user for input, collect data
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num1 = input.nextInt();
        System.out.println("Please enter another number:");
        int num2 = input.nextInt();

        // create loop
        for (int i = Math.min(num1, num2); i <= Math.max(num1,num2); i++){
            if (i != 5){
                System.out.println(i);
            }
        }


        System.out.println("End of program");
    }
}
