package recursion;

public class _01_SumOfNumbers {

    public static int sumOfNumber(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recursiveSum(int num){
        if (num > 0) return num + recursiveSum(num -1);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumber(5));
    }



}
