package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {

        //task1
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine();
        sentence = sentence.trim();
        int spaces = 0;

        if (sentence.contains(" ")){
            for (int i = 0; i < sentence.length(); i++){
             if (sentence.charAt(i) == ' '){
                 spaces += 1;
             }
            }
            System.out.println("This sentence has " + (spaces + 1) + " words");
        }else System.out.println("This sentence does not have multiple words");

        System.out.println("\n\n");
        //task2
        System.out.println("Please enter a word: ");
        String word = input.next();
        String filler = "";
        if (word.length() >= 1) {
            for (int i = word.length()-1; i >= 0; i--) {
                filler += word.charAt(i);
            }
            if (word.equals(filler)){
                System.out.println("This word is palindrome");
            }else System.out.println("This word is not palindrome");
        }else System.out.println("This word does not have 1 or more characters");

        System.out.println("\n\n");
        //task3
        System.out.println("Please enter a sentence:");
        String str = input.nextLine();
        str = input.nextLine();
        int a = 0;
        if (str.length()-1 >= 1){
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                    a += 1;
                }
            }
            System.out.println("This sentence has " + a + " 'A' or 'a' characters");
        }else System.out.println("This sentence does not have any characters");

        System.out.println("\n\n");
        //task4
        System.out.println("Please enter a positive number: ");
        int num = input.nextInt();
        if (num > 0){
            for (int i = 1; i <= num; i++){
                if (i % 2 == 0 && i % 3 == 0){
                    System.out.println("FooBar");
                }else if (i % 2 == 0){
                    System.out.println("Foo");
                }else if (i % 3 == 0){
                    System.out.println("Bar");
                }else System.out.println(i);
            }
        }else System.out.println("This number is not positive");










    }
}
