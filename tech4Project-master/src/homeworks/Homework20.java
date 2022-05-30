package homeworks;

import java.util.ArrayList;

public class Homework20 {

    // task 1
    public boolean hasLowerCase(String str) {
        boolean containsLowercase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) containsLowercase = true;
        }
        return containsLowercase;
    }

    // task 2
    public ArrayList noZero(ArrayList<Integer> array){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int num : array){
            if (num != 0){
                newArray.add(num);
            }
        }
        return newArray;
    }

    // task 3
    public static int[][] numberAndSquare(int[] array){
        int[][] newArray = new int[array.length][2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = new int[]{array[i], array[i] * array[i]};
            }
            return newArray;
        }

    // task 4
    public static boolean containsValue(String[] array, String str){
        boolean hasStr = false;
        for (String s : array){
            if (str.equals(s)) {
                hasStr = true;
                break;
            }
        }
        return hasStr;
    }

    // task 5
    public static String reverseSentence(String str){
        str = str.toLowerCase();
        String[] words = str.split(" ");
        StringBuilder newSentence = new StringBuilder();
        for (int i = words.length -1; i >= 0; i--){
            newSentence.append(words[i]).append(" ");
        }
        return newSentence.toString().trim();
    }

    // task 6
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^a-zA-Z\s]", "");
    }

    // task 7
    public static String[] removeArraySpecialsDigits(String[] array){
        for (String str : array){
            str = str.replaceAll("[^a-zA-Z\s]", "");
        }
        return array;
    }

    // task 8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> array1, ArrayList<String> array2){
        ArrayList<String> common = new ArrayList<>();
        for (String str : array1){
            if (array2.contains(str)) common.add(str);
        }
        return common;
    }

    // task 9
    public static ArrayList<String> noXInVariables(ArrayList<String> array){
        for (String str : array){
            str = str.replaceAll("[xX]", "");
        }
        return array;
    }





}
