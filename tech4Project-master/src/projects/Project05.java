package projects;
import utilities.MathHelper;

import java.util.Scanner;
public class Project05 {
    public static void main(String[] args) {

        //task1
        System.out.println("Please enter a string with 8 or more characters: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        if (s1.length() >= 8){
            String first4 = s1.substring(0,4);
            String last4 = s1.substring(s1.length()-4);
            String firstLine = s1.replace(last4, first4).substring(4, s1.length());
            System.out.println(last4 + firstLine);
        }else System.out.println("This string does not have 8 characters");

        //task2
        System.out.println("\nPlease enter a sentence: ");
        String sentence = input.nextLine();
        if (sentence.contains(" ")){
        String firstWord = sentence.substring(0, sentence.indexOf(' '));
        String lastWord = sentence.substring(sentence.lastIndexOf(' ')+1);
        String line1 = sentence.replace(lastWord, firstWord).substring(sentence.indexOf(' '));
            System.out.println(lastWord + line1 + "\n");
        }else System.out.println("This sentence does not have 2 or more words to swap\n");

        //task3
        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1.replace("stupid", "nice"));
        System.out.println(str2.replace("idiot", "nice"));
        System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));

        //task4
        System.out.println();
        String name = utilities.ScannerHelper.getNameFromUser();
        if (name.length() > 3){
            if ((name.length()) % 2 == 0){
                System.out.print(name.charAt((name.length()/2) -1));
                System.out.println(name.charAt(name.length()/2));
            }else System.out.println(name.charAt(name.length()/2));
        }else System.out.println("Invalid input!!!");

        //task5
        System.out.println("\nPlease enter a country: ");
        String country = input.nextLine();
        if (country.length() > 5){
            System.out.println(country.substring(2, country.length()-2));
        }else System.out.println("Invalid input!!!");

        //task6
        System.out.println("\nPlease enter your address:");
        String address = input.nextLine();
        System.out.println(address.replace('a', '*').replace('A', '*').replace('e', '#')
                .replace('E', '#').replace('i', '+').replace('I', '+').replace('u', '$')
                .replace('U', '$').replace('o', '@').replace('O', '@'));

        //task7
        int rndm1 = MathHelper.RandomNumberGenerator.getRandomNumber(0,25);
        int rndm2 = MathHelper.RandomNumberGenerator.getRandomNumber(0,25);

        System.out.println(rndm1 + "\n" + rndm2 + "\n");

        for (int i = rndm1; i < rndm2; i++) {
                if (i % 5 != 0) {
                    System.out.println(i);
                }
            }
    }
}
