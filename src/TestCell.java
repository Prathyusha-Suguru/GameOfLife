import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCell {
	@Test
	public void test1(){
		Cell c=new Cell();
		Assertions.assertEquals("4",c.toString());
		System.out.println("_TestCase 1 passed___");
		}
	@Test
	public void test2(){
		Cell c=new Cell();
		Assertions.assertEquals("4",c.toString());
		System.out.println("_TestCase 2 passed___");
	}
}