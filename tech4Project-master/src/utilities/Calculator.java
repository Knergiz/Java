package utilities;

public class Calculator {

    // division (int)
    public static int divide(int num1, int num2){
        return Math.max(num1, num2) / Math.min(num1, num2);
    }

    // division (double)
    public static double divide(double num1, double num2){
        return Math.max(num1, num2) / Math.min(num1, num2);
    }

    // average of 2 (int)
    public static int average(int num1, int num2){
        return (num1 + num2) / 2;
    }

    // average of 3 (int)
    public static int average(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }

    // average of 4 (int)
    public static int average(int num1, int num2, int num3, int num4){
        return (num1 + num2 + num3 + num4) / 4;
    }

    // average of 5 (int)
    public static int average(int num1, int num2, int num3, int num4, int num5){
        return (num1 + num2 + num3 + num4 + num5) / 5;
    }

    // average of 6 (int)
    public static int average(int num1, int num2, int num3, int num4, int num5, int num6){
        return (num1 + num2 + num3 + num4 + num5 + num6) / 6;
    }

    // average of 7 (int)
    public static int average(int num1, int num2, int num3, int num4, int num5, int num6, int num7){
        return (num1 + num2 + num3 + num4 + num5 + num6 + num7) / 7;
    }

    // average of 8 (int)
    public static int average(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8){
        return (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8;
    }

    // average of 9 (int)
    public static int average(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9){
        return (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9) / 9;
    }

    // average of 10 (int)
    public static int average(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10){
        return (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;
    }

    // sum of 2 (int)
    public static int sum(int num1, int num2){
        return (num1 + num2);
    }

    // sum of 2 (double)
    public static double sum(double num1, double num2){
        return (num1 + num2);
    }

    // absolute difference of 2 numbers (int)
    public static int absDif(int num1, int num2){
        return Math.abs(num1 % num2);
    }

    // absolute differance of 2 numbers (double)
    public static double absDif(double num1, double num2){
        return Math.abs(num1 % num2);
    }

    // product of 2 numbers (int)
    public static double multiply(int num1, int num2){
        return (num1 * num2);
    }

    //product of 2 numbers (double)
    public static double multiply(double num1, double num2){
        return (num1 * num2);
    }

}
