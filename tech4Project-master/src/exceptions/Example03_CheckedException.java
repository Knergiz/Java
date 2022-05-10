package exceptions;

public class Example03_CheckedException {
    public static void main(String[] args) throws InterruptedException {

        // try catch way
        /*
        try{
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        */

        // add exception to method signature way
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }



    }
}
