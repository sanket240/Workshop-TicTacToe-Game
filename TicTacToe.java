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
		desiredIndexMove(board,player);
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
	public static void desiredIndexMove(char board[],char playerMove)//placing move to desired index
	{
		 int index;
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter Index number between[1 to 9] to check:");
		 index=input.nextInt();
			 if( index>0&&index<10&&board[index]==' ')
			 {
				 System.out.println(index+" Index is empty");
				 makeMove(board,index,playerMove);
			 }
			 else
			 {
				 System.out.print("Re enter the valid index");
			 }

	}
	public static void makeMove(char board[],int index,char playerMove)
	{
		 board[index]=playerMove;
		 printBoard(board);		 
	}
}
