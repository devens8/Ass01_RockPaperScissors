import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //declare variables
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean canLoop;
        boolean restart = false;

        Scanner input = new Scanner(System.in); //setup scanner
        System.out.print("Welcome to the Rock, Paper Scissors game! ");
        //whole program is in do while loop to restart if needed
        do {
            //do while loop to gets PlayerA input
            do {
                System.out.print("Player A, please enter a move (R, P, S): "); //Output to user
                playerA = input.nextLine(); //stores input
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) { //checks if input is R, P, or S
                    canLoop = true;
                } else {
                    System.out.println(playerA + " is not valid. Please enter either R, P, or S"); //Tells user input is invalid
                    canLoop = false;
                }
            } while (!canLoop); //loops while canloop is false

            //do while loop gets PlayerB input
            do {
                System.out.print("Player B, please enter a move (R, P, S): "); //Output to user
                playerB = input.nextLine(); //stores input
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) { //checks if input is R, P, or S
                    canLoop = true;
                } else {
                    System.out.println(playerB + " is not valid. Please enter either R, P, or S"); //Tells user input is invalid
                    canLoop = false;
                }
            } while (!canLoop); //loops while canloop is false

            if (playerA.equalsIgnoreCase("R")) { //checks conditions if player A is rock, and player B is R, P, or S
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs. Rock. It's a tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) { //checks conditions if player A is paper, and player B is R, P, or S
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs. Paper. It's a tie!");
                } else {
                    System.out.println("Scissors cuts paper. Player B wins!");
                }
            } else {
                if (playerB.equalsIgnoreCase("R")) { //checks conditions if player A is scissors, and player B is R, P, or S
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts paper. Player A wins!");
                } else {
                    System.out.println("Scissors vs. Scissors. It's a tie!");
                }
            }
            //do while loop to get yes no input from user
            do {
                System.out.print("Would you like to play again (Y or N): "); //output to user
                playAgain = input.nextLine(); //stores input
                if (playAgain.equalsIgnoreCase("Y")) { //conditions to check if yes, no, or invalid output
                    canLoop = true;
                    restart = true;
                } else if (playAgain.equalsIgnoreCase("N")) {
                    canLoop = true;
                    restart = false;
                } else {
                    System.out.println("Sorry, the input is not valid. Please enter Y or N");
                    canLoop = false;
                }
            } while (!canLoop); //loops until canloop is true
        } while(restart); // restarts the whole game, only if user types yes. 
    }
}
