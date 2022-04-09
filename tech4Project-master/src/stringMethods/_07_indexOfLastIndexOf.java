package stringMethods;

public class _07_indexOfLastIndexOf {
    public static void main(String[] args) {

        String sentence = "I like Chicago and Miami more than any other cities";

        System.out.println(sentence.indexOf('C')); // 7
        System.out.println(sentence.indexOf('c')); // 10
        System.out.println(sentence.lastIndexOf('c')); // 45

        sentence.indexOf("Chicago");
        sentence.indexOf("Miami");

        System.out.println("The index of empty = " + sentence.indexOf(" "));









    }
}
