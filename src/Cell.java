
public class Cell extends GameOfLife{
	public int countTotalLiveCells=super.s;

	public int countLiveCells(int[][] l, int p, int q) {
		 int[][] board = new int[p][q];
	        for (int i = 0; i < l.length; i++) {
	            int row = l[i][0];
	            int col = l[i][1];
	            board[row][col] = 1;
	        }
        int lives = 0;
        for (int i = p - 1; i <= p + 1; i++) {
            for (int j = q - 1; j <= q + 1; j++) {
                if (i != p || j != q) {
                    if (i >= 0 && i < p && j >= 0 && j < q ){
                        lives += 1;
                    }
                }
            }
        }
        return lives;
    }

}
