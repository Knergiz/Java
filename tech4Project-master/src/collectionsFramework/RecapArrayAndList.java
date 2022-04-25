package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RecapArrayAndList {
    public static void main(String[] args) {

        int[] array = {1, 5, 7, 9, 10};
        System.out.println(Arrays.toString(array));

        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));

        ArrayList<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        Collection<String> names3 = new ArrayList<>();
        Iterable<String> names4 = new ArrayList<>();




    }
}
