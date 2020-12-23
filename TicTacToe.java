public class TicTacToe
{
	public static void main(String args[])
	{
		char[] board = createBoard();
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
	
}
