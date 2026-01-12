package code_coverage_4.code_coverage_4;
import org.junit.Test;
import static org.junit.Assert.*;



public class TestFunc1 {
	Functions f=new Functions();
	@Test	

	 public void test1() {
		
	        int result = f.func1(5,0,5);
	        assertEquals(0, result);
		}
	
	@Test 
	
	public void test2() {
		
		 assertThrows(ArithmeticException.class, () -> {
			 f.func1(0,1,10);
			 });

	 }
}

