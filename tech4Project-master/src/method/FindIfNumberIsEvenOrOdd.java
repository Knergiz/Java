package method;

import utilities.MathHelper;

public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {

        int num = MathHelper.RandomNumberGenerator.getRandomNumber(17, 33);
        if (MathHelper.isNumEven(num)){
            System.out.println("The number generated is even");
        }else System.out.println("The number generated is odd");



    }
}
