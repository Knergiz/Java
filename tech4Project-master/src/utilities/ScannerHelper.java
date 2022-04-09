package utilities;

import java.util.Scanner;

public class ScannerHelper {

    // ask user for a number (int)
    public static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = input.nextInt();
        return num1;
    }

    // ask user for a name (String)
            public static String getNameFromUser(){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a name: ");
            String name = input.nextLine();
            return name;















        }

}
