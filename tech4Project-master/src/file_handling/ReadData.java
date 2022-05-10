package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {

        File file = new File("shoppingList.txt");
        FileWriter fileWriter = new FileWriter("shoppingList.txt");
        fileWriter.write("Ice-Cream\n");
        fileWriter.write("Fruits\n");
        fileWriter.write("Pen\n");
        fileWriter.write("Paper\n");
        fileWriter.write("Milk\n");
        fileWriter.close();
        Thread.sleep(1000);

        Scanner scanner = new Scanner(file);

        for (int i = 1; scanner.hasNextLine(); i++) {
            System.out.println("Item " + i + " = " + scanner.nextLine());
        }

        file.delete();

        System.out.println("End of program");
    }
}
