package collectionsFramework;

import java.util.ArrayList;

public class Exercise01_remove_duplicates {
    public static void main(String[] args) {

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        ArrayList<String> noDuplicates = new ArrayList<>();

        for (String element : objects){
            if (!noDuplicates.contains(element)) noDuplicates.add(element);
        }

        System.out.println(noDuplicates);

    }
}
