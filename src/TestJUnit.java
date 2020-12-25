import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit {
	@Test
	public void board() {
		GameOfLife g=new GameOfLife();
		Board b=new Board();
		String s=b.currentGeneration(g.p, g.q, g.listofLivecells);
		
		Assertions.assertEquals(".**..\n..*..\n.*.*.\n.....\n.....\n",s);
		System.out.println("____TestCase board  passed______");
	}
	@Test
	public void nextGeneration(){
		GameOfLife g=new GameOfLife();
		Board b= new Board();
		boolean[][] k=g.createBoard(g.p, g.q, g.listofLivecells);
		//System.out.println(b.currentGeneration(g.p, g.q, g.listofLivecells));
		//System.out.println(b.generateNextGeneration(k,1));
		//System.out.println(b.generateNextGeneration(k,2));
		String s=b.generateNextGeneration(k,1);//here 2 indicates the 2nd generation of the board
		Assertions.assertEquals(".**..\n...*.\n..*..\n.....\n.....\n",s);
		System.out.println("____TestCase next generation  passed______");
	}
	@Test
	public void cell(){
		Cell c=new Cell();
		Assertions.assertEquals(5,c.countTotalLiveCells);
		System.out.println("____TestCase cell passed______");
	}
}
