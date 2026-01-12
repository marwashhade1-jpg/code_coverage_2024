package code_coverage_4.code_coverage_4;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestFunc2 {
	
	@Test	

	 public void test1() {
		
	        String result = Functions.func2(10,20);
	        assertEquals("p=20.00, q=1.00", result);
		}
	
	@Test 
	
	public void test2() {
		
        String result = Functions.func2(0,5);
        assertEquals("p=0.00, q=Infinity", result);
	}



}
