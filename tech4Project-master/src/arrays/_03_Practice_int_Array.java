package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {

        //task2
        int[] numbers = {-3,-7,0,2,0,7,7,10,2,15};

        System.out.println("Array not sorted = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers));

        //task2
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                positive += 1;
            }else if (numbers[i] < 0){
                negative += 1;
            }else zeros += 1;
        }

        System.out.println("Positives = " + positive);
        System.out.println("Negatives = " + negative);
        System.out.println("Zeros = " + zeros);



    }
}
