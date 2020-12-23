import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit {
	@Test
	public void testBoard() {
		Board b= new Board();
		//input (1,2)(1,3)(2,3)(3,3)---next generation
		Assertions.assertEquals("..*\n...\n...",b.createBoard().toString());
		System.out.println("____TestCase 1 passed______");
	}
	@Test
	public void testBoard1() {
		Board b= new Board();
		Assertions.assertEquals("....\n....\n....",b.createBoard().toString());
		System.out.println("____TestCase 2 passed______");
	}
}
