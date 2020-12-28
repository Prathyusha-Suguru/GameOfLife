
public class Cell {
	public int countLiveCells(boolean[][] l, int p, int q) {                // class to get the live cells count
		int n=l.length;
        int lives = 0;
        for (int i = p - 1; i <= p + 1; i++) {
            for (int j = q - 1; j <= q + 1; j++) {
                if (i != p || j != q) {
                    if (i >= 0 && i < n && j >= 0 && j < n && l[i][j] ){
                        lives += 1;
                    }
                }
            }
        }
        return lives;
    }

}
