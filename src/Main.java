public class Main
{

    public static void main(String[] args)
    {
	    boolean isSnowing = true;
        String RPSMove = "R"; // must be R P or S
        String Alex = "Alex";
        String AlexB = Alex;
        String player1, player2;

        if(isSnowing)
        {
            System.out.println("Grab your snow boots and shovel!");
        }

        if(isSnowing)
        {
            System.out.println("Grab your snow boots and shovel!");
        }
        else
        {
            System.out.println("No need for snow boots!");
        }

        if(RPSMove.equals("R"))
        {
            System.out.println("The move is ROCK!");
        }
        else if (RPSMove.equals("P"))
        {
            System.out.println("The move is PAPER");
        }
        else if(RPSMove.equals("S"))
        {
            System.out.println("The move is SCISSORS");
        }
        else
        {
            System.out.println(RPSMove + " is not a legal RPS move!");
        }

        //Resolve RPS game with two moves from the players

        player1 = "R";
        player2 = "R";

        if(player1.equals("R"))
        {
            if(player2.equals("R"))
            {
                System.out.println("Rock vs Rock its a TIE!");
            }
            else if (player2.equals("P"))
            {
                System.out.println("Paper covers Rock Player2 wins!");
            }
            else //player2 is SCISSORS
            {
                System.out.println("Rock crushes Scissors Player1 wins!");
            }
        }
        else if (player1.equals("P"))
        {
            if(player2.equals("R"))
            {
                System.out.println("Paper covers Rock Player1 wins!");
            }
            else if (player2.equals("P"))
            {
                System.out.println("Paper vs Paper its a TIE!");
            }
            else //player2 is SCISSORS
            {
                System.out.println("Scissors cuts Paper Player2 wins!");
            }
        }
        else //player1 is SCISSORS
        {
            if(player2.equals("R"))
            {
                System.out.println("Rock crushes Scissors Player2 wins!");
            }
            else if (player2.equals("P"))
            {
                System.out.println("Scissors cuts Paper Player1 wins!");
            }
            else //player2 is SCISSORS
            {
                System.out.println("Scissors vs Scissors its a TIE!");
            }
        }

        //Switch selector

        // To avoid testing for each case make it uppercase
        RPSMove = RPSMove.toUpperCase();

        switch(RPSMove)
        {
            case "R":
                System.out.println("You chose ROCK");
                break;
            case "P":
            case "p": //not needed if forces to uppercase
                System.out.println("You chose PAPER");
                break;
            case "S":
                System.out.println("You chose SCISSORS");
                break;
            default:
                System.out.println("Illegal RPS Move " + RPSMove);

        }

    }
}
