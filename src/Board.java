public class Board extends Cell{
	public boolean[][] requiredGeneration(boolean l[][],int  k ) {      
		int n =l.length;                                               
		boolean[][] newBoard=new boolean[n][n];                         
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ilives = countLiveCells(l, i, j);

                if (l[i][j]) {
                    if (ilives < 2) {                                    
                        newBoard[i][j] = false;
                    } else if (ilives <= 3) {
                        newBoard[i][j] = true;
                    } else if (ilives > 3) {
                        newBoard[i][j] = false;
                    }
                } else {
                    if (ilives == 3) {
                        newBoard[i][j] = true;
                    }
                }
            }
		}
		while(k>1) {													
			newBoard=requiredGeneration(newBoard,1);
			k--;
		}
		return newBoard;
	}	
}
