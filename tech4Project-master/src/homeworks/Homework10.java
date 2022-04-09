package homeworks;

public class Homework10 {
    public static void main(String[] args) {

        //task1
        //given string no scanner :(
        String str = "JavaScript";
        System.out.println(str);
        if (str.length() >= 1){
            System.out.println("The length of the String is: " + str.length());
            System.out.println("The first char of the String is: " + str.charAt(0));
            System.out.println("The last char of the String is: " + str.charAt(str.length()-1));
            if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")||
            str.contains("A") || str.contains("E") || str.contains("I") || str.contains("O") || str.contains("U")){
                System.out.println("This string has a vowel\n");
            }else System.out.println("This string does not have a vowel\n");
        }else System.out.println("Length is zero\n");

        //task2
        String str2 = "toyota";
        System.out.println(str2);
        if (str2.length() >= 3){
            if (str2.length() % 2 == 0){
                System.out.println("Middle two characters are: " + str2.substring((str2.length()/2 -1), str2.length()/2 + 1));
            }else System.out.println("Middle character is: " + str2.charAt(str2.length()/2));
        }else System.out.println("Length is less than 3");
        System.out.println();

        //task3
        String str3 = "Python";
        System.out.println(str3);
        if (str3.length() >= 4){
            System.out.println("First two characters: " + str3.substring(0,2));
            System.out.println("Last two characters: " + str3.substring(str3.length()-2));
            System.out.println("Middle characters: " + str3.substring(2, str3.length()-2));
        }else System.out.println("INVALID INPUT");
        System.out.println();

        //task4
        String str4 = "xy";
        System.out.println(str4);
        if (str4.length() >= 2){
            if (str4.substring(0,2) == str4.substring(str4.length()-2)){
                System.out.println(true);
            }else System.out.println(false);
        }else System.out.println("Length is less than 2");
        System.out.println();

        //task5
        String s5 = "123456";
        String s5two = "Blue";
        System.out.println(s5);
        System.out.println(s5two);
        if (s5.length() >= 2 && s5two.length() >= 2) {
            System.out.println(s5.substring(1, s5.length() - 1).concat(s5two.substring(1, s5two.length() - 1)));
        }else System.out.println("Invalid input!");
        System.out.println();

        //task6
        String s6 = "green";
        System.out.println(s6);
        if (s6.length() >= 4){
            if (s6.substring(0,2) == "xx" && s6.substring(s6.length()-2) == "xx"){
                System.out.println(true);
            }else System.out.println(false);
        }else System.out.println("INVALID INPUT");



    }
}
