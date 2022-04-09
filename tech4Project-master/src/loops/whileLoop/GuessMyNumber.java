package loops.whileLoop;

import utilities.ScannerHelper;

import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {

        Random rndm = new Random();
        int usersNumber = ScannerHelper.getNumberFromUser();
        int num = rndm.nextInt(10) + 1;
        int attempt = 1;

        while(usersNumber != num){
            System.out.println("Attempt " + attempt++);
            usersNumber = ScannerHelper.getNumberFromUser();
        }
        System.out.println("You finally found the number!");
        System.out.println("It took you " + attempt + " attempts");


    }
}
