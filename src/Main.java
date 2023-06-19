import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA = "Player A";
        String playerB = "Player B";
        String yesOrNo = "";

        do
        {
            System.out.println("Would you like to play Rock Paper Scissors? Yes or No?");
            yesOrNo = in.nextLine();

            do
            {
                System.out.println("Player A: choose R, P, or S");
                playerA = in.nextLine();
                System.out.println("Player B: choose R, P, or S");
                playerB = in.nextLine();

                if(playerA.equalsIgnoreCase("R"))
                {
                    if(playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock vs. Rock. It's a tie!");
                    } else if(playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper beats Rock! Player B wins!");
                    } else {
                        System.out.println("Rock beats Scissors! Player A wins!");
                    }
                } else if(playerA.equalsIgnoreCase("P"))
                {
                    if(playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Paper beats Rock! Player A wins!");
                    } else if(playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper vs. Paper. It's a tie!");
                    } else {
                        System.out.println("Scissors beats Paper! Player B wins!");
                    }
                } else {
                    if(playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock beats Scissors! Player B wins!");
                    } else if(playerB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors beats Paper! Player A wins!");
                    } else {
                        System.out.println("Scissors vs. Scissors! It's a tie!");
                    }
                }

                System.out.println("Would you like to play again? Yes or No?");
                yesOrNo = in.nextLine();

            } while (yesOrNo.equalsIgnoreCase("Yes"))
        }
    }
}