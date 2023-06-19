import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declare variables
        int countA = 0;
        int countB =0;
        String playA = "";
        String playB = "";
        String continueYN = "";
        boolean done = false;
        boolean finished = false;

        do {
            do {
                System.out.print("Enter move for Player A [RPS]: ");
                playA = in.nextLine();
                playA = playA.toUpperCase();

                System.out.print("Enter move for Player B [RPS]: ");
                playB = in.nextLine();
                playB = playB.toUpperCase();

                System.out.println("Player A: " + playA + "   Player B: " + playB);

                if (playA.matches("[RPS]") && playB.matches("[RPS]"))  // If either player make an illegal move
                {
                    done = true;
                } else {
                    System.out.println("Move was invalid try again...");
                }
            } while (!done);
            done = false;  // Set done to false for the next do while loop

            // Computing

            if (playA.equals("P")) {
                if (playB.equals("R")) {
                    System.out.println("Paper covers Rock! Player A wins!");
                    countA += 1;  // add 1 to playA wins
                } else if (playB.equals("P")) {
                    System.out.println("Paper vs Paper! Its a tie!");
                } else // PlayB is Scissors
                {
                    System.out.println("Scissors cuts Paper! Player B Wins");
                    countB += 1; // add 1 to playB wins
                }
            } else if (playA.equals("R")) {
                if (playB.equals("R")) {
                    System.out.println("Rock vs Rock! Its a Tie!");

                } else if (playB.equals("P")) {
                    System.out.println("Paper covers Rock! Player B wins!");
                    countB += 1; // add 1 to playB wins

                } else // PlayB is Scissors
                {
                    System.out.println("Rock breaks Scissors! Player A Wins");
                    countA += 1; // add 1 to playA wins
                }
            } else // PlayA is Scissors
            {
                if (playB.equals("R")) {
                    System.out.println("Rock breaks Scissors! Player B Wins!");
                    countB += 1; // add 1 to playB wins
                } else if (playB.equals("P")) {
                    System.out.println("Scissors cuts Paper! Player A Wins!");
                    countA += 1; // add 1 to playA wins
                } else // PlayB is Scissors
                {
                    System.out.println("Scissors vs Scissors! It's a Tie");
                }
            }

            // Continue playing as well as printing wins
            do {
                System.out.print("Would you like too continue? [YN] ");
                continueYN = in.nextLine();
                continueYN = continueYN.toUpperCase();
                if (continueYN.matches("[N]")) {
                    done = true; // When input is equal to no to end the loop
                    System.out.println("Wins A: " + countA + " Wins B: " + countB);
                    finished = true;
                }
                else if (continueYN.matches("[Y]")){
                    System.out.println("Wins A: " + countA + " Wins B: " + countB);
                    finished = true;
                }
            }while(!finished);
        }while(!done);
    }
}
