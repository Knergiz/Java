package exceptions;

import java.util.ArrayList;

public class FinallyBlock {
    public static void main(String[] args) {


            ArrayList<String> objects = new ArrayList<>();
            objects.add("Computer");
            objects.add("Mouse");
            objects.add("MousePad");

            try {
                for (String object : objects) {
                    objects.remove(object);
                }
            }finally {
                System.out.println("Here is the report!!!! We report the exception here!!!");
            }

        System.out.println("End Of The Program");


    }
}
