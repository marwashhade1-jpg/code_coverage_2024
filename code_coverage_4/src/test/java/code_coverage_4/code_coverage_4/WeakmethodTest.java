package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class WeakmethodTest {
	Functions f=new Functions();

	@Test	

	 public void test1() {
		
	        int result = f.weakMethod(10,10);
	        assertEquals(1, result);
		}
	
	@Test 
	
	public void test2() {
		
		 assertThrows(ArithmeticException.class, () -> {
			 f.weakMethod(0, 0);
			 });

	 }

}
