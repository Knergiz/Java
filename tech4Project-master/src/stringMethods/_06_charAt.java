package stringMethods;

public class _06_charAt {
    public static void main(String[] args) {

        String name = "John";

        System.out.println(name.charAt(0)); // J
        System.out.println(name.charAt(1)); // o
        System.out.println(name.charAt(2)); // h
        System.out.println(name.charAt(3)); // n

        char firstChar = name.charAt(0);

        if (firstChar == 'A' || firstChar == 'a'){
            System.out.println("This name starts with \"A\"");
        }else{
            System.out.println("This name does not start with \"A\"");
        }


    }
}
