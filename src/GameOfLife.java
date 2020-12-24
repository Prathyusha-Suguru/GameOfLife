public class GameOfLife {
	
			public int p=5;//no.of rows in a board
			public int q=5;//no.of columns in a board
			public int[][] listofLivecells= {{0,1},{1,1},{1,2},{2,1},{2,2},{4,4}};
			public int s=listofLivecells.length;
			
			public boolean[][] createBoard(int p, int q, int l[][]){
				boolean[][] board = new boolean[p][q];
				for (int i =0; i <l.length;i++) {
					int row = l[i][0];
					int column = l[i][1];
					board[row][column] = true;
				}
				return board;
			

			}
			public String printBoard(boolean board[][]) {
				StringBuffer sb = new StringBuffer();
				for(int i=0; i < board.length;i++) {
					for(int j=0;j<board[i].length;j++) {
						if(board[i][j])
							sb.append("*");
						else
							sb.append(".");
					}
					sb.append("\n");
				}
				//sb.toString();
				return sb.toString();
				}
}