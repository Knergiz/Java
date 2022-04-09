package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {

        // my way with if() statement
        for (int i = 1; i <= 25; i++){
            if (i % 10 != 0){
                System.out.println(i);
            }
        }

        //using continue control statement in if() statement
        for (int i = 1; i <= 25; i++){
            if (i % 10 == 0){
                continue;
            }else{
                System.out.println(i);
            }
        }

        //do not print any number after 15 without changing end point in for() statement
        for (int i = 1; i <= 25; i++){
            if (i % 10 == 0){
                continue;
            }else{
                System.out.println(i);
            }if (i == 15){
                break;
            }
        }


    }
}
