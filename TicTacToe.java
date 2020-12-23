import java.util.Scanner;
import java.util.Random;
public class TicTacToe
{
	public static void main(String args[])
	{
		char[] board = createBoard();
		char player,computer;
		player=LetterSelect();
		if(player=='X') 
		{
			computer='0';	
		}
		else
		{
			computer='X';
		}
		System.out.println("Computer Letter is:"+computer +"  "+"Player letter is:"+player);
		printBoard(board);
	}
	private static char[] createBoard() //Creating a board method 
	{
		 char[] board = new char[10];
		 for(int i=1;i<board.length;i++)
		 {
		 	board[i] = ' ';//initializing empty spaces to board index
		 }
		 System.out.println(" Board Created ");
		 return board;
	}
	public static char LetterSelect()//Selecting letter method
	{
		 System.out.println("Choose letters for player and Computer");
		 Scanner input=new Scanner(System.in);
		 char player;
		 System.out.println("Enter For player(X/0)");
		 player=input.next().charAt(0);	
		 return player;  	 	 
	}
	public static void printBoard(char board[])//printing the board method
	{
		 System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |"); 
		 System.out.println("|-----------|");
		 System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		 System.out.println("|-----------|");
		 System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
		 System.out.println("|-----------|");
	}
	
}
