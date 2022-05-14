package homeworks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework18 {

    public static String noSpace(String str){
            return str.replace(" ", "");
    }

    public static String replaceFirstLast(String str){
        if (str.trim().length() > 1){
            str = str.trim();
            char placeholder = str.charAt(0);
            str = str.replace(str.charAt(0), str.charAt(str.length()-1));
            str = str.replace(str.charAt(str.length()-1), placeholder);
        }else str = "";
        return str;
    }

    public static Boolean hasVowel(String str){
        return str.toLowerCase().contains("a") || str.toLowerCase().contains("e") ||
                str.toLowerCase().contains("o") || str.toLowerCase().contains("u") ||
                str.toLowerCase().contains("i");
    }

    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat sDF = new SimpleDateFormat("yyyy");
        String currentYear = sDF.format(date);
        int age = Integer.parseInt(currentYear) - yearOfBirth;
        if (age >= 16 && age < 100){
            System.out.println("AGE IS ALLOWED");
        }else if (age < 16){
            System.out.println("AGE IS NOT ALLOWED");
        }else System.out.println("AGE IS NOT VALID");
    }

    public static int averageOfEdges(int num1, int num2, int num3){
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        return (max + min) / 2;
    }

    public static String[] noA(String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].toLowerCase().startsWith("a")) stringArray[i] = "###";
        }
        return stringArray;
    }

    public static int[] no3or5(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] % 3 == 0){
                array[i] = 101;
            }else if (array[i] % 5 == 0){
                array[i] = 99;
            }else if (array[i] % 3 == 0){
                array[i] = 100;
            }
        }
        return array;
    }

    public static int countPrimes(int[] array){
        int count = 0;
        for (int num : array){
            Boolean prime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    prime = false;
                    break;
                }
            }
            if (prime) count++;
        }
        return count;
    }







}
