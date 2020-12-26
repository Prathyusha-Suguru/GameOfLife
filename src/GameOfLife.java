public class GameOfLife {
	
			public int p=5;                                                                //no.of rows in a board
			public int q=5;                                                                //no.of columns in a board
			public int[][] listofLivecells= {{0,1},{0,2},{1,2},{2,1},{2,3}};               //list of list of live cells
			public int s=listofLivecells.length;                                           // to check the live cells count
			
			public boolean[][] createBoard(int p, int q, int l[][]){                       // creating a boolean board 
				boolean[][] board = new boolean[p][q]; 
				for (int i =0; i <l.length;i++) {                                          // loop to represent the live cells with true values
					int row = l[i][0];
					int column = l[i][1];
					board[row][column] = true;
				}
				return board;                                                                // returning boolean board

			}
			public String printBoard(boolean board[][]) {                                    // creating class for printing board
				StringBuffer sb = new StringBuffer();
				for(int i=0; i < board.length;i++) {
					for(int j=0;j<board[i].length;j++) {
						if(board[i][j])
							sb.append("*");                                                  // live cell into '*'
						else
							sb.append(".");                                                   // live cell into '.'
					}
					sb.append("\n");                                                          // for next line
				}
				return sb.toString();                                                         //converting into string and returning string value
				}

}