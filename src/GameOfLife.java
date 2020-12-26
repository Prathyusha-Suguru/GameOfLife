public class GameOfLife {
	
			public int p;                                                               
			public int q;                                                                
			public int[][] listofLivecells;              
			                                        
			
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
				return sb.toString();                                                         
				}

}