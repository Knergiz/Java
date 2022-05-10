package exceptions;

import org.w3c.dom.ls.LSOutput;

public class Example01 {
    public static void main(String[] args) {
        String[] names = {"Alex", "John", "Max"};

        try {
            System.out.println(names[5]);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
