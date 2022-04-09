package homeworks;

import javax.swing.text.Utilities;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Homework15 {
    public static void main(String[] args) {

        //task1
        System.out.println("- - - - -task1- - - - -\n");

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(23);
        nums.add(67);
        nums.add(23);
        nums.add(78);

        System.out.println(nums.get(3));
        System.out.println(nums.get(0));
        System.out.println(nums.get(2));

        //task2
        System.out.println("\n- - - - -task2- - - - -\n");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        //task3
        System.out.println("\n- - - - -task3- - - - -\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(-34);
        numbers.add(-56);
        numbers.add(0);
        numbers.add(89);
        numbers.add(100);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        //task4
        System.out.println("\n- - - - -task4- - - - -\n");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        //task5
        System.out.println("\n- - - - -task5- - - - -\n");

        ArrayList<String> marvel = new ArrayList<>();
        marvel.add("Spider Man");
        marvel.add("Iron Man");
        marvel.add("Black Panther");
        marvel.add("Deadpool");
        marvel.add("Captain America");

        System.out.println(marvel);
        if (marvel.contains("Wolverine")){
            System.out.println(true);
        }else System.out.println(false);

        //task6
        System.out.println("\n- - - - -task6- - - - -\n");

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);
        if (avengers.contains("Hulk") && avengers.contains("Iron Man")){
            System.out.println(true);
        }else System.out.println(false);

        //task7
        System.out.println("\n- - - - -task7- - - - -\n");

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');
        System.out.println(chars);
        for (char c : chars){
            System.out.println(c);
        }

        //task8
        System.out.println("\n- - - - -task8- - - - -\n");

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int count = 0;
        for (String item : objects){
            if (item.toLowerCase().charAt(0) == 'm'){
                count++;
            }
        }
        System.out.println(count);

        int amount = 0;

        for (String item : objects){
            if (item.toLowerCase().contains("a") || item.toLowerCase().contains("e")){

            }else amount++;
        }
        System.out.println(amount);

        //task9
        System.out.println("\n- - - - -task9- - - - -\n");

        ArrayList<String> kitchen = new ArrayList<>();
        kitchen.add("Plate");
        kitchen.add("spoon");
        kitchen.add("fork");
        kitchen.add("Knife");
        kitchen.add("cup");
        kitchen.add("Mixer");

        System.out.println(kitchen);
        int upper = 0;
        int lower = 0;
        int haveP = 0;
        int startOrEndP = 0;

        for (String item : kitchen){
            if (utilities.CharacterHelper.isUppercase(item.charAt(0))){
                upper++;
            }else lower++;

            if (item.toLowerCase().contains("p")) haveP++;

            if (item.toLowerCase().charAt(0) == 'p' || item.charAt(item.length()-1) == 'p') startOrEndP++;
            }

        System.out.println("Elements starting with uppercase = " + upper);
        System.out.println("Elements starting with lowercase = " + lower);
        System.out.println("Elements having P or p = " + haveP);
        System.out.println("Elements starting or ending with P or p = " + startOrEndP);

        //task10
        System.out.println("\n- - - - -task10- - - - -\n");

        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(5);
        num.add(7);
        num.add(10);
        num.add(0);
        num.add(20);
        num.add(17);
        num.add(10);
        num.add(23);
        num.add(56);
        num.add(78);

        int div10 = 0;
        int evenAndGreaterthan15 = 0;
        int oddAndLessThan20 = 0;
        int lessThan15orGreaterThan50 = 0;

        System.out.println(num);
        for (int n : num){
            if (n % 10 == 0) div10++;
            if (n % 2 == 0 && n > 15) evenAndGreaterthan15++;
            if (n % 2 != 0 && n < 20) oddAndLessThan20++;
            if (n < 15 || 50 < n) lessThan15orGreaterThan50++;
        }

        System.out.println("Elements that can be divided by 10 = " + div10);
        System.out.println("Elements that are even and greater than 15 = " + evenAndGreaterthan15);
        System.out.println("Elements that are odd and less that 20 = " + oddAndLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessThan15orGreaterThan50);

        }












    }


