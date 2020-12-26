public class Board extends Cell{
	public String currentGeneration(int p, int q, int l[][]) {       //for getting current generation
		//printBoard(createBoard(p, q, l));
		return printBoard(createBoard(p, q, l));
	}
	public boolean[][] requiredGeneration(boolean l[][],int  k ) {      // class to get required generation
		int n =l.length;                                                // getting length of list
		boolean[][] newBoard=new boolean[n][n];                          // created the new board to update the next generation during iterations
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
		while(k>1) {													// loop to get required generation 
			newBoard=requiredGeneration(newBoard,1);
			k--;
		}
		return newBoard;
	}	
}
	

