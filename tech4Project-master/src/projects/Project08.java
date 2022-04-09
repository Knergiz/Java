package projects;

import java.util.ArrayList;

public class Project08 {

    //task1
    public static int countMultipleWords(String[] array){
        int count = 0;
        for (String str : array){
            str = str.trim();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' '){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    //task2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> arraylist){
        arraylist.removeIf(num -> num < 0);
        return arraylist;
    }

    //task3
    public static boolean validatePassword(String str){
        boolean digit = false;
        boolean uppercase = false;
        boolean lowercase = false;
        boolean special = false;
        boolean length = false;
        boolean space = false;
        if (str.length() >= 8 && str.length() <= 16) length = true;
        for (int i = 0; i < str.length(); i++) {
            if (utilities.CharacterHelper.isDigit(str.charAt(i))){
                digit = true;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++){
            if (utilities.CharacterHelper.isUppercase(str.charAt(i))){
                uppercase = true;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++){
            if (utilities.CharacterHelper.isLowercase(str.charAt(i))){
                lowercase = true;
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 33 && str.charAt(i) <= 47){
                special = true;
                break;
            }
        }
            if (!str.contains(" ")) space = true;


        if (digit && uppercase && lowercase && special && length && space){
            return true;
        }else return false;
        }

        //task4
        public static boolean validateEmailAddress(String email){
        boolean space = false;
        boolean at = false;
        boolean format = false;

        if (email.contains("@")) at = true;
        if (!email.contains(" ")) space = true;
        if (email.substring(0, email.indexOf('@')).length() > 2 &&
                email.substring(email.indexOf('@'), email.indexOf('.')).length() > 2 &&
                email.substring(email.indexOf('.'), email.length()-1).length() > 2){
            format = true;
        }
        if (space && at && format){
            return true;
        }else return false;

        }





    }





