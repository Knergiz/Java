package recursion;

public class _02_ProductOfNumbers {
    public static int recursiveProduct(int num){
        if (num > 1) return num * recursiveProduct(num -1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(recursiveProduct(5));
    }
}
