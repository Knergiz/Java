package exceptions;

public class UnderstandingException {
    public static void main(String[] args) {

        String name = "John";

        try{
            System.out.println(name.charAt(10));
        } catch (StringIndexOutOfBoundsException exception){
            System.out.println("An exception is here!!!!");
        }

        System.out.println("End of the program!");


    }
}
