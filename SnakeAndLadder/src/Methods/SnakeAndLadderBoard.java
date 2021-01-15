package Methods;


public class SnakeAndLadderBoard // class name
{
	public void board(int scoreOfPLayerOne, int scoreOfPLayerTwo) // method
	{
		PrintThePositionOfPlayers position = new PrintThePositionOfPlayers(); // the other class that will be using in this method
		
		// printing the board and calling the method "positionDecreasing" and "posintionIncreasing" from the class "PrintThePositionOfPlayer
		System.out.println("| ----------------------------------- BOARD ----------------------------------- |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  100  |  99   |  98   |  97   |  96   |  95   |  94   |  93   |  92   |  91   |");
		position.positionDecreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 100);
		System.out.println("|       |  L7   |       |  S7   |       |  S6   |       |       |   L8  |       |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  81   |  82   |  83   |  84   |  85   |  86   |  87   |  88   |  89   |  90   |");
		position.positionIncreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 81);
		System.out.println("|       |       |       |       |       |       |       |  S4   |       |       |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  80   |  79   |  78   |  77   |  76   |  75   |  74   |  73   |  72   |  71   |");
		position.positionDecreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 80);
		System.out.println("|  L7   |       |  S7   |       |       |  L5   |       |       |       |  L8   |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  61   |  62   |  63   |  64   |  65   |  66   |  67   |  68   |  69   |  70   |");
		position.positionIncreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 61);
		System.out.println("|       |  S3   |       |       |       |       |  L6   |       |       |       |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  60   |  59   |  58   |  57   |  56   |  55   |  54   |  53   |  52   |  51   |");
		position.positionDecreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 60);
		System.out.println("|       |       |       |       |       |  S6   |       |       |       |       |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  41   |  42   |  43   |  44   |  45   |  46   |  47   |  48   |  49   |  50   |");
		position.positionIncreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 41);
		System.out.println("|       |  L4   |       |       |       |       |       |  S5   |       |  L6   |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  40   |  39   |  38   |  37   |  36   |  35   |  34   |  33   |  32   |  31   |");
		position.positionDecreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 40);
		System.out.println("|       |       |  L1   |       |  S1   |       |       |       |  S2   |       |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  21   |  22   |  23   |  24   |  25   |  26   |  27   |  28   |  29   |  30   |");
		position.positionIncreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 21);
		System.out.println("|  L4   |       |       |  S4   |       |  S5   |       |  L5   |       |  L3   |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|  20   |  19   |  18   |  17   |  16   |  15   |  14   |  13   |  12   |  11   |");
		position.positionDecreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 20);
		System.out.println("|       |       |  S3   |       |       |       |  L2   |       |       |       |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
		System.out.println("|   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |  10   |");
		position.positionIncreasing(scoreOfPLayerOne, scoreOfPLayerTwo, 1);
		System.out.println("|  L1   |       |       |  L2   |       |  S1   |       |  L3   |       |  S2   |");
		System.out.println("+ - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - + - - - +");
	}

}
