package homeworks;


import java.util.Arrays;


public class Test {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        String str = "Java is fun";
        String str2 = "Java123 is%# fun";

        System.out.println(Arrays.deepToString(Homework20.numberAndSquare(array)));
        System.out.println(Homework20.reverseSentence(str));
        System.out.println(Homework20.removeStringSpecialsDigits(str2));

    }
}
