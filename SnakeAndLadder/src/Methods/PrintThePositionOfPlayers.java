package Methods;

public class PrintThePositionOfPlayers // class name
{
	
	public void positionDecreasing(int firstPlayer, int secondPlayer, int startingNumber) // method
	{
		do // loop for printing the middle part of each block of the snake and ladder board
		{
			if (firstPlayer == startingNumber && secondPlayer == startingNumber) // condition for locating if both players are in the current block that is about to print
			{
				System.out.print("| p1 p2 ");
			}
			else if (firstPlayer == startingNumber) // condition for locating if player 1 is in the current block that is about to print
			{
				System.out.print("|   p1  ");
			}
			else if (secondPlayer == startingNumber) // condition for locating if player 2 is in the current block that is about to print
			{
				System.out.print("|   p2  ");
			}
			else // if both players are not in the current block that is about to print then print a hollow middle part
			{
				System.out.print("|       ");
			}
			startingNumber--; // decrementing the starting number
		}
		while ((startingNumber)%10 != 0); // condition for the do while loop that if the modulo of the starting number is not equal to 0 then continue looping
		System.out.println("|"); // printing a vertical line after the loop
	}
	public void positionIncreasing(int firstPlayer, int secondPlayer, int startingNumber) // method
	{
		do
		{
			if (firstPlayer == startingNumber && secondPlayer == startingNumber)
			{
				System.out.print("| p1 p2 ");
			}
			else if (firstPlayer == startingNumber)
			{
				System.out.print("|   p1  ");
			}
			else if (secondPlayer == startingNumber)
			{
				System.out.print("|   p2  ");
			}
			else
			{
				System.out.print("|       ");
			}
			startingNumber++; // incrementing the starting number
		}
		while ((startingNumber)%10 != 1); // condition for the do while loop that if the modulo of the starting number is not equal to 1 then continue looping
		System.out.println("|"); // printing a vertical line after the loop
	}

}
