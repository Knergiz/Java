package utilities;

import java.util.Arrays;

public class MathHelper {

    // max of three (int)
    public static int maxOfThree(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));
    }

    // max of three (double)
    public static double maxOfThree(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    // min of three (byte)
    public static byte minOfThree(byte num1, byte num2, byte num3){
        return (byte) Math.min(num1, Math.min(num2, num3));
    }

    // get random number
    public class RandomNumberGenerator {
        public static int getRandomNumber(int start, int end){
            return (int)(Math.random()*(end - start + 1)) + start;
        }
    }

    // even or odd (int)
    //   |      |
    //   V      V
    // true   false
    public static boolean isNumEven(int num){
        return num % 2 == 0;
    }

    //  odd or even (int)
    //   |      |
    //   V      V
    // true   false
    public static boolean isNumOdd(int num){
        return num % 2 != 0;
    }

    // positive or negative (int)
    //     |           |
    //     V           V
    //   true        false
    public static boolean isPositive(int num){
        return num > 0;
    }

    // negative or positive (int)
    //     |           |
    //     V           V
    //   true        false
    public static boolean isNegative(int num){
        return num < 0;
    }

    // equals zero (int)
    public static boolean isZero(int num){
        return num == 0;
    }

    // greatest and smallest of an array (int) (with sort)
    public static int findGreatestAndSmallestWithSort(int[] array) {
        Arrays.sort(array);
        System.out.println("Smallest = " + array[0]);
        System.out.println("Greatest = " + array[array.length - 1]);
        return array[0];
    }

    // greatest and smallest of an array (int) (no sorting)
    public static int findGreatestAndSmallest(int[] array){
        int greatest = 0;
        int smallest = Integer.MAX_VALUE;
        for (int num : array){
            if (num > greatest){
                greatest = num;
            }else if (num < smallest){
                smallest = num;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
        return greatest;
    }

    // second greateast and second smallest in array (int) (no sorting)
    public static int findSecondGreatestAndSmallest(int[] array){
        int greatest = Integer.MIN_VALUE;
        int secondGreatest = 0;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = 0;
        for (int num : array){
            if (num > greatest){
                secondGreatest = greatest;
                greatest = num;
            }else if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);
        return greatest;
    }


}
