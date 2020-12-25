public class Board extends Cell{
	//boolean[][] changeBoard=new boolean[p][q];
	public String currentGeneration(int p, int q, int l[][]) {
		//printBoard(createBoard(p, q, l));
		return printBoard(createBoard(p, q, l));
	}
	public String generateNextGeneration(boolean l[][],int  k ) {
		int n =l.length;
		boolean[][] currentBoard=l;
		boolean[][] newBoard=new boolean[n][n];
		int count=1;
		while(count<=k) {
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ilives = countLiveCells(currentBoard, i, j);

                if (currentBoard[i][j]) {
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
		//this.changeBoard = newBoard;
		currentBoard=newBoard;
		count=count+1;
		}
		return printBoard(currentBoard);
	}	
}
	

