import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit {
	public int[][] Livecell= {{1,1},{1,2},{2,1},{3,3}};
	public int p1=4;
	public int q1=4;
	@Test
	public void board1() {
		Board b=new Board();                                                      //creating object for Board
		String s=b.currentGeneration(p1, q1,Livecell);                            //assigning to the string 's' for the easy access in next step	
		Assertions.assertEquals("....\n.**.\n.*..\n...*\n",s);                    //string comparison expected v/s actual
		System.out.println("____TestCase board 1 passed______");
	}
	@Test
	public void nextGeneration1(){
		GameOfLife g=new GameOfLife();                                            //creating object for GameOfLife
		Board b= new Board();                                                     //creating object for Board
		String s=b.printBoard(b.requiredGeneration(g.createBoard(p1, q1, Livecell),10));  //assigning to the string 's' for the easy access in next step and here 10 indicates the 10nd generation of the board
		Assertions.assertEquals("....\n.**.\n.**.\n....\n",s);                   //string comparison expected v/s actual
		System.out.println("____TestCase next generation  1 passed______");
	}
	@Test
	public void board2() {
		GameOfLife g=new GameOfLife();                                             //creating object for GameOfLife
		Board b=new Board();                                                       //creating object for Board
		String s=b.currentGeneration(g.p, g.q, g.listofLivecells);	               //assigning to the string 's' for the easy access in next step		
		Assertions.assertEquals(".**..\n..*..\n.*.*.\n.....\n.....\n",s);          //string comparison expected v/s actual
		System.out.println("____TestCase board 2 passed______");
	}
	@Test
	public void nextGeneration2(){
		GameOfLife g=new GameOfLife();                                                   //creating object for GameOfLife
		Board b= new Board();                                                            //creating object for Board
		String s=b.printBoard(b.requiredGeneration(g.createBoard(g.p, g.q, g.listofLivecells),2)); //assigning to the string 's' for the easy access in next step and here 2 indicates the 2nd generation of the board
		Assertions.assertEquals("..*..\n.*.*.\n.....\n.....\n.....\n",s);                  //string comparison expected v/s actual
		System.out.println("____TestCase next generation 2 passed______");
	}
	@Test
	public void cell2(){
		Cell c=new Cell();                                                               //creating object for Cell
		Assertions.assertEquals(5,c.countTotalLiveCells);                                  //count comparison expected v/s actual
		System.out.println("____TestCase cell 2 passed______");
	}
}
