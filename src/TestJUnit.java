import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit {
	@Test
	public void board() {
		GameOfLife g=new GameOfLife();
		Board b=new Board();
		String s=b.currentGeneration(g.p, g.q, g.listofLivecells);
		
		Assertions.assertEquals(".*...\n.**..\n.**..\n.....\n....*\n",s);
		System.out.println("____TestCase board  passed______");
	}
	@Test
	public void nextGeneration(){
		GameOfLife g=new GameOfLife();
		Board b= new Board();
		String s=b.generateNextGeneration(g.createBoard(g.p, g.q, g.listofLivecells));
		Assertions.assertEquals(".**..\n*....\n.**..\n.....\n.....\n",s);
		System.out.println("____TestCase next generation  passed______");
	}
	@Test
	public void cell(){
		Cell c=new Cell();
		Assertions.assertEquals(6,c.countTotalLiveCells);
		System.out.println("____TestCase cell passed______");
	}
}
