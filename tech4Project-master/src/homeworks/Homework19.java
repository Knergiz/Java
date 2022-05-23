package homeworks;

public class Homework19 {


    //task 1
    public static String noDigit(String str){
        return str.replaceAll("[0-9]", "");
    }

    //task 2
    public static String noVowel(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    //task 3
    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                str = str.replaceAll("^[0-9]", "");
                for (int j = 0; j < str.length(); j++) {
                    sum += str.charAt(j);
                }
                break;
            }
        }
        return sum;
    }

    //task 4
    public static boolean hasUpperCase(String str){
        boolean uppercase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) uppercase = true;
        }
        return uppercase;
    }

    //task 5
    public static int middleInt(int num1, int num2, int num3){
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        if (num1 != max && num1 != min) return num1;
        else if (num2 != max && num2 != min) return num2;
        else return num3;
    }

    //task 6
    public static int[] no13(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) array[i] = 0;
        }
        return array;
    }

    //task 7
    public static int[] arrFactorial(int[] array){


        return array;
    }

    //task 8
    public static String[] categorizeCharacters(String str){
        String[] array = {"", "", ""};
        array[0] = str.replaceAll("^a-zA-Z", "");
        array[1] = str.replaceAll("^0-9", "");
        array[2] = str.replaceAll("a-zA-Z0-9", "");
        return array;
    }


}
