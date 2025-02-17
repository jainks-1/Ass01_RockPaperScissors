// Kaden Jain
// Computer Programming 1 - Spring 2025
/*
Code the Rock Paper Scissors program:
a. Get a move choice from playerA which must be R, P, S or r, p, s
    -   Loop until you get a valid move
b. Get a move choice from playerB in the same manner
c. Display the results using the accepted phrases from the game
    - Rock breaks Scissors,
    - Paper covers Rock,
    - Scissors cuts Paper
and indicate the winner (Player A wins) or Rock vs Rock it’s a Tie!  Etc…
d. Prompt the user to play again [Y/N]
e. Continue or terminate based on the user’s choice.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Declare variables
        Scanner in = new Scanner(System.in);
        String userPlay = "";
        String playerOneMove = "";
        String playerTwoMove = "";

        System.out.println("-Welcome to Rock Paper Scissors!");

        // play again do-while loop
        do {
            // Get P1 input loop - if/else input checking
            do {
                System.out.println("-Player one please select[ R, P, S]: ");
                in.hasNext();
                playerOneMove = in.next();
                in.nextLine();

                if (playerOneMove.equalsIgnoreCase("R") ||
                        playerOneMove.equalsIgnoreCase("P") ||
                        playerOneMove.equalsIgnoreCase("S")){
                    System.out.println("\n-Pass to player two");
                }
                else {
                    System.out.println("\n-Please enter a valid move: [R, P, S]: ");
                }
            }
            while (!playerOneMove.equalsIgnoreCase("R") &&
                    !playerOneMove.equalsIgnoreCase("P") &&
                    !playerOneMove.equalsIgnoreCase("S"));

            // Get P2 input loop - if/else input checking
            do {
                System.out.println("-Player two please select[ R, P, S]: ");
                in.hasNext();
                playerTwoMove = in.next();
                in.nextLine();

                if (playerTwoMove.equalsIgnoreCase("R") ||
                        playerTwoMove.equalsIgnoreCase("P") ||
                        playerTwoMove.equalsIgnoreCase("S")){
                    System.out.println("\n-Here are the results: ");
                }
                else {
                    System.out.println("\n-Please enter a valid move: [R, P, S]: ");
                }

            }
            while (!playerTwoMove.equalsIgnoreCase("R") &&
                    !playerTwoMove.equalsIgnoreCase("P") &&
                    !playerTwoMove.equalsIgnoreCase("S"));

            // logic for results
            if (playerOneMove.equals(playerTwoMove)) {
                System.out.println("\n-" + playerOneMove + " VS " +playerTwoMove + " - It’s a tie!");
            }
			else {
                if (playerOneMove.equalsIgnoreCase("R")) {
                    if (playerTwoMove.equalsIgnoreCase("S")) {
                        System.out.println("-Rock beats Scissors, Player One wins!");
                    } else {
                        System.out.println("-Paper beats rock, Player Two wins!");
                    }
                }
				else if (playerOneMove.equalsIgnoreCase("P")){
                    if (playerTwoMove.equalsIgnoreCase("R")){
                        System.out.println("-Paper beats Rock, Player One wins!");
                    }
                    else {
                        System.out.println("-Scissors beats Paper, Player Two wins!");
                    }
                }
				else {
                    if (playerTwoMove.equalsIgnoreCase("R")) {
                        System.out.println("-Rock beats Scissors, Player Two wins!");
                    }
                    else {
                        System.out.println("-Scissors beats Paper, Player One wins!");
                    }
                }
            }

            // prompt to play again
            System.out.println("\n-Do you want to play again? [Y, N]: ");
            in.hasNext();
            userPlay = in.next();
            in.nextLine();
            System.out.println("\n");
        }
        while (userPlay.equalsIgnoreCase("Y"));

        System.out.println("\n-Thanks for playing! Have a nice day.");
    }
}