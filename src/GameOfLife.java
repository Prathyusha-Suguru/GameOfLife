import java.util.Scanner;
public class GameOfLife {
			public boolean[][] createBoard(int p, int q, int l[][]){
				boolean[][] board = new boolean[p][q];
				for (int i =0; i <l.length;i++) {
					int row = l[i][0];
					int column = l[i][1];
					board[row][column] = true;
				}
				System.out.println("CurrentGeneration");
				printBoard(board);
				System.out.println("NextGeneration");
				return board;
			}
			public void printBoard(boolean board[][]) {
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
				System.out.println(sb.toString());
			}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter  no.of rows in board :");
				int board_rows = sc.nextInt();
				System.out.println("enter  no.of columnns in board :");
				int board_columns = sc.nextInt();
				int n = sc.nextInt();
				int[][] listof_livecells = new int[board_rows][2];
				int i =0;
				for(i=0; i< n;i++) {
					listof_livecells[i][0] = sc.nextInt();
					listof_livecells[i][1]=sc.nextInt();
				}

				 GameOfLife cgl = new GameOfLife();
				 //cgl.generateNextGeneration(cgl.createBoard(board_rows,board_columns,listof_livecells);
				 sc.close();
				
			}
}

