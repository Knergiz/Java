package homeworks;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class TestForHomework18 {
    public static void main(String[] args) {

        String str = "   hello world  ";
        String[] strings = {"apple", "Hello", "Alexa"};
        int[] nums = {7, 4, 11, 23, 17};

        System.out.println(Homework18.noSpace(str));

        System.out.println(Homework18.replaceFirstLast(str));

        System.out.println(Homework18.hasVowel(str));

        Homework18.checkAge(2002);

        System.out.println(Homework18.averageOfEdges(10, 13, 20));

        System.out.println(Arrays.toString(Homework18.noA(strings)));

        System.out.println(Arrays.toString(Homework18.no3or5(nums)));

        System.out.println(Homework18.countPrimes(nums));


        System.out.println("end of program");


    }
}
