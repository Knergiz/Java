package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) throws Exception {


        File file = new File("items.txt");
        FileWriter fileWriter = new FileWriter("items.txt");

        fileWriter.write("Computer\n");
        fileWriter.write("Phone\n");
        fileWriter.write("Table\n");
        fileWriter.write("Chair\n");
        fileWriter.write("Mouse\n");
        fileWriter.write("Screen\n");
        fileWriter.write("Remote");
        fileWriter.close();

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()){
            if (scan.nextLine().toLowerCase().contains("n")) System.out.println(scan.nextLine());
        }



    }
}
