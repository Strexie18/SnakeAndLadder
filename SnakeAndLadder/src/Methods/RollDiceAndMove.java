package Methods;

import java.util.Random;


public class RollDiceAndMove // class name
{

	public int rollDice(int playerNumber, int score) // method
	{
		Random numberGenerator = new Random(); // making a random number generator
		int randomNumberGenerated = numberGenerator.nextInt(10) + 2; // generating a random number in the interval 2 - 12
		System.out.println("Player " + playerNumber + " got " + randomNumberGenerated + " points."); // printing the random number generated
		score += randomNumberGenerated; // adding the random number generated to the score of the player
		
		// condition to determine if there is a player that already reach or exceeds 100 points
		if (score >= 100)
		{
			return score;
		}
		
		// switch statement
		switch (score)
		{
		case 1:
			 score = (score + 37);
			 System.out.println("He or she was lucky to be placed on tile 1 now he or she is in tile 38");
			 break;
		case 4:
			 score = (score + 10);
			 System.out.println("He or she was lucky to be placed on tile 4 now he or she is in tile 14");
			 break;
		case 8:
			 score = (score + 22);
			 System.out.println("He or she was lucky to be placed on tile 8 now he or she is in tile 30");
			 break;
		case 21:
			 score = (score + 21);
			 System.out.println("He or she was lucky to be placed on tile 21 now he or she is in tile 42");
			 break;
		case 28:
			 score = (score + 47);
			 System.out.println("He or she was lucky to be placed on tile 28 now he or she is in tile 75");
			 break;
		case 50:
			 score = (score + 17);
			 System.out.println("He or she was lucky to be placed on tile 50 now he or she is in tile 67");
			 break;
		case 71:
			 score = (score + 21);
			 System.out.println("He or she was lucky to be placed on tile 71 now he or she is in tile 92");
			 break;
		case 80:
			 score = (score + 19);
			 System.out.println("He or she was lucky to be placed on tile 80 now he or she is in tile 99");
			 break;
		case 97:
			 score = (score - 19);
			 System.out.println("He or she was unlucky to be placed on tile 97 now he or she is in tile 78");
			 break;
		case 95:
			 score = (score - 40);
			 System.out.println("He or she was unlucky to be placed on tile 95 now he or she is in tile 55");
			 break;
		case 88:
			 score = (score - 64);
			 System.out.println("He or she was unlucky to be placed on tile 88 now he or she is in tile 24");
			 break;
		case 62:
			 score = (score - 44);
			 System.out.println("He or she was unlucky to be placed on tile 62 now he or she is in tile 18");
			 break;
		case 48:
			 score = (score - 22);
			 System.out.println("He or she was unlucky to be placed on tile 48 now he or she is in tile 26");
			 break;
		case 32:
			 score = (score - 22);
			 System.out.println("He or she was unlucky to be placed on tile 32 now he or she is in tile 10");
			 break;
		case 36:
			 score = (score - 30);
			 System.out.println("He or she was unlucky to be placed on tile 36 now he or she is in tile 6");
			 break;
		default:
			 System.out.println("Now he or she is in tile " + score);
		}
		return score; // return the score of the player after the switch statement
		
	}

}
