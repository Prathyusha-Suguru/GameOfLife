public class GameOfLife {
	
			public int p;                                                               
			public int q;                                                                
			public int[][] listofLivecells;   
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