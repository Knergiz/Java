package projects;

import utilities.MathHelper;

import javax.swing.text.Utilities;
import java.util.Arrays;

public class Project07 {
    public static void main(String[] args) {

        //task1
        System.out.println("- - - - Task-1 - - - -\n");

        int[] numbers = {1, 4, 6, 0, -15, 14, 3, 7};
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length -1]);

        //task2
        System.out.println("\n- - - - Task-2 - - - -\n");

        MathHelper.findGreatestAndSmallest(numbers);
        /*
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
        } */

        //task3
        System.out.println("\n- - - - Task-3 - - - -\n");

        MathHelper.findGreatestAndSmallestWithSort(numbers);

        /*
        public static int findGreatestAndSmallest(int[] array) {
            Arrays.sort(array);
            System.out.println("Smallest = " + array[0]);
            System.out.println("Greatest = " + array[array.length - 1]);
            return array[0];
        } */

        //task4
        System.out.println("\n- - - - Task-4 - - - -\n");

        MathHelper.findSecondGreatestAndSmallest(numbers);

        /*
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
    } */

        //task5
        System.out.println("\n- - - - Task-5 - - - -\n");

        String[] fooBar = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        utilities.StringHelper.findDuplicates(fooBar);

        /*
        public static String findDuplicates(String[] array){
            for (int i = 0; i < array.length; i++){
                for (int j = i + 1 ; j < array.length; j++) {
                    if (array[i].equals(array[j])){
                        System.out.println(array[i]);
                        break;
                    }
                }
            }
            return "yay";
        } */

        //task6
        System.out.println("\n- - - - Task-6 - - - -\n");

        String[] stuff = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        utilities.StringHelper.findMostRepeated(stuff);

        /*
        public static String findMostRepeated(String[] array){
            int count = 0;
            int count2 = 0;
            String mostRepeated = "";
            for (int i = 0; i < array.length; i++){
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])){
                        count2 += 1;
                    }
                }
                if (count2 > count){
                    count = count2;
                    mostRepeated = array[i];
                }
            }
            System.out.println(mostRepeated);
            return "String";
        } */
    }
}
