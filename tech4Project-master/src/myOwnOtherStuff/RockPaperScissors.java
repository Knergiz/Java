package myOwnOtherStuff;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {

        String[] comChoice = {"rock", "paper", "scissors"};
        int userPoints = 0;
        int comPoints = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to \"Rock, Paper, Scissors\"!");
        System.out.println("The rules are simple, you must enter either \"rock\" \"paper\" or \"scissors\"");
        System.out.println("Rock > scissor, scissor > paper, paper > rock");
        System.out.println("If entered choice beasts the computers choice, you gain a point!");
        System.out.println("The game finishes once either you or the computer gains 3 points\n");
        System.out.println("Ready, set, ......GO!");

        while (userPoints < 3 && comPoints < 3){
            String comTurn = comChoice[(int) (Math.random() * 3)];
            System.out.println("Please enter your next move");
            String turn = input.nextLine();
            System.out.println("Computer chose " + comTurn);

            if (turn.toLowerCase().equals("rock") && comTurn.equals(comChoice[2])){
                userPoints += 1;
                System.out.println("You got a point\n!");
            }else if (turn.toLowerCase().equals("paper") && comTurn.equals(comChoice[0])){
                userPoints += 1;
                System.out.println("You got a point!\n");
            }else if (turn.toLowerCase().equals("scissors") && comTurn.equals(comChoice[1])){
                userPoints += 1;
                System.out.println("You got a point!\n");
            }else if (turn.toLowerCase().equals(comTurn)){
                System.out.println("You tied, no points given\n");
            }else{
                comPoints += 1;
                System.out.println("Computer got a point :(\n");
            }
        }

        if (userPoints == 3){
            System.out.println("You won!");
        }else System.out.println("You lost :( sorry");




    }
}
