package Methods;

import java.util.Scanner;


public class MainMethod // class name
{

	public static void main(String args[]) // method
	{	
		// Input from the user
		Scanner inputScan = new Scanner(System.in);
		
		// Asking their name
		System.out.print("Player 1, please enter your name: ");
		String playerOneName = inputScan.nextLine(); 
		System.out.print("Player 2, please enter your name: ");
		String playerTwoName = inputScan.nextLine(); 

		// Other classes that will be using in this program
		RollDiceAndMove playerDice = new RollDiceAndMove();
		SnakeAndLadderBoard displayBoard = new SnakeAndLadderBoard();
		
		
		int[] playerScore = {0, 0}; // Array that is responsible for saving the score of the players
		int turnDeterminer = 0; // object that is used for switching the turns in rolling the dice
		while (playerScore[0] < 100 && playerScore[1] < 100) // Condition for determining if no player have a score that is greater than or equal to 100 then the loop will continue
		{
			if (turnDeterminer < 2) 
			{
				// asking if the player will roll his or her dice or not
				System.out.print("Player " + (turnDeterminer + 1) + ", enter [r] if you want to roll your dice (enter any except [r] if you want to skip): ");
				char choiceToRoll = inputScan.next().charAt(0);
	
				
				if (choiceToRoll == 'r') // if the user input low case [r] then proceed
				{
					playerScore[turnDeterminer] = playerDice.rollDice(turnDeterminer + 1, playerScore[turnDeterminer]); /* calling the method "rollDice" from class "RollDiceAndMove" 
																														and the return value will be saved to the variable "playerScore"*/
					
					displayBoard.board(playerScore[0], playerScore[1]); // calling the method "board" from the class "SnakeAndLadderBoard"
					
					if (playerScore[turnDeterminer] >= 100) // condition that determines if the there is a player that is already reach or exceeds 100 point then that ends the loop
					{
						break;
					}
				}
				else // if the user choose to skip his or her turn to roll the dice by no inputing [r]
				{
					System.out.println("opps!! you skip your turn...");
				}
				turnDeterminer++; // increment the object by 1 in every iteration
			}
			else // if the object "turnDeterminer" is greater than or equal to 2 then refresh it by updating it again back to 0
			{
				turnDeterminer = 0;
			}

		}
		inputScan.close(); // closing the scan to prevent memory leakage in your program
		
		// for printing the name of the winner
		if (turnDeterminer == 0)
		{
			System.out.println("The winner for this game is " + playerOneName);
		}
		else
		{
			System.out.println("The winner for this game is " + playerTwoName);
		}

	}

}
