package stringMethods;

public class _03_equals {
    public static void main(String[] args) {

        System.out.println("Melda".equals("Melda")); //true
        System.out.println("melda".equals("Melda")); //false

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";

        System.out.println(name1.equals(name2)); // false
        System.out.println(name2.equals(name3)); // true

        System.out.println("\n------Practices-------\n");

        String str1 = "Hello";
        String str2 = str1;

        boolean b = !(str1.equals(str2));
        System.out.println(b);



    }
}
