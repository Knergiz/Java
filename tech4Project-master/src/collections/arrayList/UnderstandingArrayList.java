package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        //declaring an Array vs ArrayList
        String[] namesArray = new String[5]; //array

        ArrayList<String> namesList = new ArrayList<>(); //arrayList

        //how to print the size of Array vs ArrayList
        System.out.println(namesArray.length);
        System.out.println(namesList.size());

        //how to add elements to array vs arrayList
        namesArray[0] = "Abe"; // normal array assigning
        namesArray[4] = "Data"; // normal array assigning

        namesList.add("Abe"); // add method that takes object
        namesList.add(1, "Data"); // add object to a specific index
        namesList.add(1, "John"); // add john to index of 1 and shift data to index of 2
        namesList.set(2, "Lionel"); // replace john with lionel
        namesList.add("Alona"); // alona added to index of 3
        namesList.add("Max"); // max added to the index of 4
        namesList.add(0, "James"); // james is added to index of 0, all other objects shifted forward by one index
        namesList.set(3, "Lionel"); // object at index of 3 replaced with lionel

        //printing array vs arrayList
        System.out.println(Arrays.toString(namesArray));

        System.out.println(namesList);

        //removing objects
        // namesList.remove(7);
        // namesList.remove("James");
        // namesList.removeAll(namesList); <-- removes entire collection

        //how to use get()    -->   basically ElementAt(index)
        System.out.println(namesList.get(0));



    }
}
