import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit {
	@Test
	public void testBoard() {
		GameOfLife g=new GameOfLife();
		String s=(String)g.createBoard(g.p, g.q, g.listofLivecells);
		//input (1,2)(1,3)(2,3)(3,3)---next generation
		Assertions.assertEquals(".....\n..**.\n...*.\n...*.\n.....\n",s);
		System.out.println("____TestCase board passed______");
	}
	@Test
	public void testBoard1() {
		Board b= new Board();
		
		Assertions.assertEquals("....\n....\n....",b.createBoard().toString());
		System.out.println("____TestCase 2 passed______");
	}
	@Test
	public void test2(){
		Cell c=new Cell();
		Assertions.assertEquals(4,c.countTotalLiveCells);
		System.out.println("____TestCase cell passed______");
	}
}
