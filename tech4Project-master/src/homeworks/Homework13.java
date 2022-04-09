package homeworks;

public class Homework13 {
    public static void main(String[] args) {

        //task1
        System.out.println("- - - - - Task-1 - - - - -\n");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 && i % 5 == 0){
                System.out.println("FooBar");
            }else if (i % 2 == 0){
                System.out.println("Foo");
            }else if (i % 5 == 0){
                System.out.println("Bar");
            }else System.out.println(i);
        }

        //task2
        System.out.println("\n- - - - - Task-2 - - - - -\n");
        int numP = 0;
        int numN = 0;
        boolean pos = false;
        boolean neg = false;

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        while (!pos && !neg) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0 && !pos) {
                    pos = true;
                    numP = numbers[i];
                } else if (numbers[i] < 0 && !neg) {
                    neg = true;
                    numN = numbers[i];
                }
            }
        }
        System.out.println("First positive number is: " + numP);
        System.out.println("First negative number is: " + numN);

        //task3
        System.out.println("\n- - - - - Task-3 - - - - -\n");

        int rndm1 = (int) (Math.random() * 10) + 1;
        int rndm2 = (int) (Math.random() * 10) + 1;
        int rndm3 = (int) (Math.random() * 10) + 1;
        int rndm4 = (int) (Math.random() * 10) + 1;
        int rndm5 = (int) (Math.random() * 10) + 1;
        System.out.println(rndm1 + " - " + rndm2 + " - " + rndm3 + " - " + rndm4 + " - " + rndm5);

        int[] array = {rndm1, rndm2, rndm3, rndm4, rndm5};

        boolean twoOrThree = false;
        for (int n : array){
            if (n == 2 || n == 3){
                twoOrThree = true;
            }
        }
        System.out.println(twoOrThree);

        //task4
        System.out.println("\n- - - - - Task-4 - - - - -\n");

        String[] fruit = {"banana", "orange", "Apple"};
        boolean tOrF = false;
        for (String n : fruit){
            if (n.toLowerCase().equals("apple")){
                tOrF = true;
            }
        }
        System.out.println(tOrF);

        //task5
        System.out.println("\n- - - - - Task-5 - - - - -\n");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        for (int first : numbers1){
            for (int second : numbers2){
                if (first == second){
                    System.out.println(first);
                }
            }
        }

        //task6
        System.out.println("\n- - - - - Task-6 - - - - -\n");

        String str = "baNana";
        str = str.toLowerCase();

        for (char s : str.toCharArray()){
            for (int i = 1; i < str.toCharArray().length; i++){
                if (s == str.toCharArray()[i]){
                    System.out.println(s);
                    break;
                }
            }
        }





















    }
}
