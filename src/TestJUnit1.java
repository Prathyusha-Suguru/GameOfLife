import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit1 {
	@Test
	public void test1(){
		Cell c=new Cell();
		Assertions.assertEquals("3",c.toString());
		System.out.println("____TestCase 1 passed______");
		}
	@Test
	public void test2(){
		Cell c=new Cell();
		Assertions.assertEquals("4",c.toString());
		System.out.println("____TestCase 2 passed______");
	}
}
