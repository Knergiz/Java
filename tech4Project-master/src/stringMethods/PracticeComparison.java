package stringMethods;
import java.util.Scanner;
public class PracticeComparison {
    public static void main(String[] args) {

    Scanner inputData = new Scanner(System.in);

    System.out.println("Please enter 2 strings:");

    String str1 = inputData.nextLine();
    String str2 = inputData.nextLine();

    if (str1.equals(str2)){
        System.out.println("These strings are equal");
    }else {
        System.out.println("These strings are not equal");
    }




    }
}
