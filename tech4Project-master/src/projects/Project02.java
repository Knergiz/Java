package projects;

import utilities.MathHelper;

public class Project02 {
    public static void main(String[] args){


        //task1

        String s1 = "24", s2 = "5";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("The sum of 24 and 5 is = " + (i1 + i2));
        System.out.println("The subtraction of 24 and 5 is = " + (i1 - i2));
        System.out.println("The division of 24 and 5 is = " + ((double) i1 / i2));
        System.out.println("The multiplication of 24 and 5 is = " + (i1 * i2));
        System.out.println("The remainder of 24 and 5 is " + (i1 % i2) + "\n");

        //task2

        int rndmNum = (int) (Math.random() * 36);
        System.out.println(rndmNum);

        switch (rndmNum){
            case 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;

            default:
                System.out.println("THE NUMBER IS NOT A PRIME NUMBER\n");
        }

        //task3

        int random1 = (int) (Math.random() * 51);
        int random2 = (int) (Math.random() * 51);
        int random3 = (int) (Math.random() * 51);

        int max = Math.max(Math.max(random1, random2), random3);
        int min = Math.min(Math.min(random1, random2), random3);

        System.out.println("Lowest number is = " + min);

        if (random1 != max && random1 != min){
            System.out.println("Middle number is = " + random1);
        }else if (random2 != max && random1 != min){
            System.out.println("Middle number is = " + random2);
        }else{
            System.out.println("Middle number is = " + random3);
        }

        System.out.println("Greatest number is " + max + "\n");

        //task4

        char c1 = '5';
        char c2 = 'a';
        char c3 = 'R';

        System.out.println(c1);
        if ((c1 >= 65 && c1 <= 90) || (c1 >= 97 && c1 <= 122)){
            if (Character.isUpperCase(c1)){
                System.out.println("The letter is uppercase");
            }else {
                System.out.println("The letter is lowercase");
            }
        }else {
            System.out.println("Invalid Character detected!!!");
        }

        System.out.println(c2);
        if ((c2 >= 65 && c2 <= 90) || (c2 >= 97 && c2 <= 122)){
            if (Character.isUpperCase(c2)){
                System.out.println("The letter is uppercase");
            }else {
                System.out.println("The letter is lowercase");
            }
        }else {
            System.out.println("Invalid Character detected!!!");
        }

        System.out.println(c3);
        if ((c3 >= 65 && c3 <= 90) || (c3 >= 97 && c3 <= 122)){
            if (Character.isUpperCase(c3)){
                System.out.println("The letter is uppercase");
            }else {
                System.out.println("The letter is lowercase");
            }
        }else {
            System.out.println("Invalid Character detected!!!");
        }

        //task5

        char l1 = '#';
        char l2 = 'E';
        char l3 = 'R';

        if ((l1 >= 65 && l1 <= 90) || (l1 >= 97 && l1 <= 122)){
            switch (l1){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    System.out.println("The letter is a vowel");
                    break;
                default:
                    System.out.println("The letter is a consonant");
            }
        }else{
            System.out.println("Invalid character detected!!!\n");
        }

        //task6

        char n1 = '8';
        char n2 = '*';

        if (((n1 >= 33) && (n1 <= 47)) || ((n1 >= 58) && (n1 <= 64)) || ((n1 >= 91) && (n1 <= 96)) || ((n1 >= 123) && (n1 <= 126))){
            System.out.println("Special character is = " + n1);
        }else{
            System.out.println("Invalid character detected!!!");
        }

        if (((n2 >= 33) && (n2 <= 47)) || ((n2 >= 58) && (n2 <= 64)) || ((n2 >= 91) && (n2 <= 96)) || ((n2 >= 123) && (n2 <= 126))){
            System.out.println("Special character is = " + n2);
        }else{
            System.out.println("Invalid character detected!!!\n");
        }

        //task7

        char x1 = 'g';
        char x2 = '5';
        char x3 = '@';

        if ((x1 >= 65 && x1 <= 90) || (x1 >= 97 && x1 <= 122)){
            System.out.println("The character is a letter");
        }else if(x1 >= 48 && x1 <= 57){
            System.out.println("The character is a digit");
        }else System.out.println("The character is a special digit");

        if ((x2 >= 65 && x2 <= 90) || (x2 >= 97 && x2 <= 122)){
            System.out.println("The character is a letter");
        }else if(x2 >= 48 && x2 <= 57){
            System.out.println("The character is a digit");
        }else System.out.println("The character is a special digit");

        if ((x3 >= 65 && x3 <= 90) || (x3 >= 97 && x3 <= 122)){
            System.out.println("The character is a letter");
        }else if(x3 >= 48 && x3 <= 57){
            System.out.println("The character is a digit");
        }else System.out.println("The character is a special digit");

    }
}
