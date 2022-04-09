package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        for (int num : numbers){
            if (num % 2 == 0){
                System.out.println("First even: " + numbers[num]);
                break;
            }
        }
        for (int num : numbers){
            if (num % 2 != 0){
                System.out.println("First odd: " + numbers[num]);
                break;
            }
        }



    }
}
