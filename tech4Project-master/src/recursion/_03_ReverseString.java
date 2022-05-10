package recursion;

public class _03_ReverseString {
    public static String reverseString(String str){
     if (str.length() <= 1) return str;
     else return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Apple"));
    }




}
