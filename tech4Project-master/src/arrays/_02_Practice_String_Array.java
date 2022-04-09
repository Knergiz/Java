package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        //task1
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("Sorted array = " + Arrays.toString(students));

        //task2
        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length-1]);

        //task3
        int num = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i].charAt(0) == 'A'){
                num += 1;
            }
        }
        System.out.println(num + " names start with A");

        //task4
        int count = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i].contains("a") || students[i].contains("e") || students[i].contains("E") || students[i].contains("A")){
                count += 1;
            }
        }
        System.out.println(count + " names contain a-A or e-E");

        //task5
        int amount = 0;
        for (String student : students){
            if (student.length() >= 5){
                count++;
            }
        }

        //task6
        boolean tOrF = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals("Jennifer")){
                tOrF = true;
            }
        }
        System.out.println(tOrF);






    }
}
