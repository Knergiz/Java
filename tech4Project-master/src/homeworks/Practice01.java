package homeworks;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {

        //task 1
        System.out.println("task1 - - - - - - - - - - ");
        String str = "SDLC is step by step procedure to create an application";
        System.out.println(str.length());
        System.out.println(str.indexOf("SDLC"));
        System.out.println(str.indexOf("application"));

        //task 2
        System.out.println("task2 - - - - - - - - - - -");
        String str2 = "  I know how to code with Python  ";
        System.out.println(str2.trim().toUpperCase().replace("PYTHON", "JAVA"));

        //task 3
        System.out.println("task3 - - - - - - - - - - -");
        String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ";str3.trim();
        System.out.println(str3.charAt(0) + "\n" + str3.charAt(str3.length()-1));

        //task 4
        System.out.println("task4 - - - - - - - -  - - -");
        String s1 = "  TECH ";
        String s2 = " glo  ";
        String s3 = " BAL       ";
        String s4 = s1.trim().toLowerCase().replace('t', 'T') + s2.trim().replace('g', 'G') +
                s3.trim().toLowerCase();
        System.out.println(s4);

        //task 5
        System.out.println("task5 - - - - - - - - - - - -");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite color");
        String color = input.nextLine();
        System.out.println("1st character is = " + color.charAt(0));
        System.out.println("Last character is = " + color.charAt(color.length()-1));
        System.out.println("First 3 characters are = " + color.substring(0, 3));
        System.out.println("last 3 characters are = " + color.substring(color.length()-3));

        //task 6
        System.out.println("task6 - - - - - - - - - - - - ");
        System.out.println("Please enter a full sentence: ");
        String sentence = input.nextLine(); sentence.toLowerCase();
        System.out.println("1st word is = " + sentence.substring(0,sentence.indexOf(' ') ));
        System.out.println("Last word is = " + sentence.substring(sentence.lastIndexOf(' ')+1));

        //task 7
        System.out.println("task7 - - - - - - - - - - - - ");
        System.out.println("Please enter a full sentence");
        String sentence2 = input.nextLine();
        if (sentence2.contains("$")){
            System.out.println("This sentence contains \"$\" character\n" + "\"$\" character's index is = " +
                    sentence2.indexOf("$"));
        }else System.out.println("This sentence does not contain \"$\" character");







    }
}
