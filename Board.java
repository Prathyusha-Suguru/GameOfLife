public class Board extends Cell{
	public int p,q;
	public boolean array[][];
	public Board(int p,int q) {
		this.array=new boolean[p][q];
		this.p=p;
		this.q=q;
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				this.array[i][j]=false;
			}
		}
	}
	public void createBoard(int l[][]){                      
		for (int i =0; i <l.length;i++) {                                          
			int row = l[i][0]; 
			int column = l[i][1];
			this.array[row][column] = true;
		}                                                               
	}
	public boolean[][] requiredGeneration(boolean l[][]) {                                                
		boolean[][] newBoard=new boolean[p][q]; 
		for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                int ilives = countLiveCells(l, i, j);

                if (l[i][j]) {
                    if (ilives < 2 || ilives>3) {                                    
                        newBoard[i][j] = false;
                    } else {
                        newBoard[i][j] = true;
                    } 
                } else {
                    if (ilives == 3) {
                        newBoard[i][j] = true;
                    }
                }
            }
		}
		return newBoard;
	}	
}
