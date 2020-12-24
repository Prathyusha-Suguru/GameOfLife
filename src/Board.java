public class Board extends Cell{
	public String currentGeneration(int p, int q, int l[][]) {
		//printBoard(createBoard(p, q, l));
		return printBoard(createBoard(p, q, l));
	}
	public String generateNextGeneration(boolean l[][] ) {
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
		//printBoard(newBoard);
		return printBoard(newBoard) ;
	}
	
}
	

