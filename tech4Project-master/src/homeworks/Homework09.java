package homeworks;
import java.util.Scanner;
public class Homework09 {
    public static void main(String[] args) {

        //task 1
        String name = utilities.ScannerHelper.getNameFromUser();
        System.out.println("Name entered is: " + name + "\nThe length of that name is: " + name.length() +
                "\nThe first character in that name is: " + name.charAt(0) + "\nThe last character in that name is: " +
                name.charAt(name.length()-1) + "\nThe first three characters in that name is: " + name.charAt(0) +
                name.charAt(1) + name.charAt(2) + "\nThe last three characters in that name is: " +
                name.charAt(name.length()-3) + name.charAt(name.length()-2) + name.charAt(name.length()-1));
        if (name.charAt(0) == 'A' || name.charAt(0) == 'a'){
            System.out.println("You are in the club!");
        }else{
            System.out.println("Sorry, you are not in the club");
        }

        //task 2
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter your address: ");
        String address = input.nextLine();
        System.out.println("Address entered is: " + address);
        if (address.contains("Chicago") || address.contains("chicago")){
            System.out.println("You are in the club!");
        }else if (address.toLowerCase().contains("des plaines") || address.toLowerCase().contains("desplaines")){
            System.out.println("You are welcome to join the club");
        }else System.out.println("Sorry, you will never be in the club");

        //task 3
        System.out.println("\nPlease enter at least four colors: ");
        String color = input.nextLine();
        System.out.println("Colors entered: " + color);
        if (color.toLowerCase().contains("green") && color.toLowerCase().contains("red")){
            System.out.println("Green and red are in the list\n");
        }else if (color.toLowerCase().contains("green")){
            System.out.println("Green is in the list\n");
        }else if (color.toLowerCase().contains("red")){
            System.out.println("Red is in the list\n");
        }else System.out.println("Green and red are not in the list\n");

        //task 4
        String str = "   Java is FUN   ";
        System.out.println(str);
        String firstWord = str.toLowerCase().substring(3,7);
        System.out.println(firstWord);
        String secondWord = str.toLowerCase().substring(8,11);
        System.out.println(secondWord);
        String thirdWord = str.toLowerCase().substring(11,14);
        System.out.println(thirdWord);
    }
}
