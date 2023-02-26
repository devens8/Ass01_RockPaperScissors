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
            } while (!canLoop);

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
            } while (!canLoop);

            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs. Rock. It's a tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs. Paper. It's a tie!");
                } else {
                    System.out.println("Scissors cuts paper. Player B wins!");
                }
            } else {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts paper. Player A wins!");
                } else {
                    System.out.println("Scissors vs. Scissors. It's a tie!");
                }
            }

            do {
                System.out.print("Would you like to play again (Y or N): ");
                playAgain = input.nextLine();
                if (playAgain.equalsIgnoreCase("Y")) {
                    canLoop = true;
                    restart = true;
                } else if (playAgain.equalsIgnoreCase("N")) {
                    canLoop = true;
                    restart = false;
                } else {
                    System.out.println("Sorry, the input is not valid. Please enter Y or N");
                    canLoop = false;
                }
            } while (!canLoop);
        } while(restart);
    }
}