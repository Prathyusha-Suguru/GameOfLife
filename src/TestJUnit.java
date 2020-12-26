import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit {
public int[][] Livecell= {{1,1},{1,2},{2,1},{3,3}};
public int[][] Livecell2={{0,1},{0,2},{1,2},{2,1},{2,3}};
	@Test
	public void board1() { 
		GameOfLife g=new GameOfLife(); 
		String s=g.printBoard(g.createBoard(4, 4,Livecell));                           
		Assertions.assertEquals("....\n.**.\n.*..\n...*\n",s);                    
		System.out.println("____TestCase board 1 passed______");
	}
	@Test
	public void nextGeneration1(){
		GameOfLife g=new GameOfLife();                                            
		Board b= new Board();                                                     
		String s=g.printBoard(b.requiredGeneration(g.createBoard(4, 4, Livecell),10));  
		Assertions.assertEquals("....\n.**.\n.**.\n....\n",s);                  
		System.out.println("____TestCase next generation  1 passed______");
	}
	
	
	@Test
	public void board2() {
		GameOfLife g=new GameOfLife();												                                                              
		String s=g.printBoard(g.createBoard(5, 5, Livecell2));	               		
		Assertions.assertEquals(".**..\n..*..\n.*.*.\n.....\n.....\n",s);         
		System.out.println("____TestCase board 2 passed______");
	}
	@Test
	public void nextGeneration2(){
		GameOfLife g=new GameOfLife();                                                   
		Board b= new Board();                                                            
		String s=g.printBoard(b.requiredGeneration(g.createBoard(5,5,Livecell2),2)); 
		Assertions.assertEquals("..*..\n.*.*.\n.....\n.....\n.....\n",s);                 
		System.out.println("____TestCase next generation 2 passed______");
	}
	@Test
	public void cell2(){                                                            
		Assertions.assertEquals(5,Livecell2.length);                                  
		System.out.println("____TestCase cell 2 passed______");
	}
}
