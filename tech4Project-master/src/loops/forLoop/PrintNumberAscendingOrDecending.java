package loops.forLoop;

import java.util.Random;

public class PrintNumberAscendingOrDecending {
    public static void main(String[] args) {

        Random rndm = new Random();
        int num1 = rndm.nextInt(26);
        int num2 = rndm.nextInt(26);

        System.out.println(num1);
        System.out.println(num2 + "\n");

        /* my way
        if (num1 > num2){
            for (int i = num2; i < num1; i++){
                if (i % 5 != 0){
                    System.out.println(i);
                }
            }
        }else for (int i = num1; i < num2; i++){
            if (i % 5 != 0){
                System.out.println(i);
            }
        }
        */

        // better way
        String s = "";
        for (int i = Math.min(num1,num2); i <= Math.max(num1, num2); i++){
            if (i % 5 != 0) s += i + " - ";
        }
        System.out.println(s.substring(0, s.length()-3));




    }
}
