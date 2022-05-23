package homeworks;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class TestForHomework18 {
    public static void main(String[] args) {

        String str = "123hello world !#@";
        int[] array = {1, 2, 13, 4, 13};

        System.out.println(Homework19.noDigit(str));
        System.out.println(Homework19.sumOfDigits(str));
        System.out.println(Homework19.hasUpperCase(str));

        System.out.println(Homework19.middleInt(5, 10, 7));
        System.out.println(Arrays.toString(Homework19.no13(array)));
        System.out.println(Arrays.toString(Homework19.categorizeCharacters(str)));



    }
}
