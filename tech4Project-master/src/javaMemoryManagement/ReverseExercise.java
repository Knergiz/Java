package javaMemoryManagement;

public class ReverseExercise {
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
