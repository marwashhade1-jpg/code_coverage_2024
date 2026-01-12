package code_coverage_4.code_coverage_4;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestFunc3 {
	@Test 
	
	public void test1() {
		
		 assertThrows(ArithmeticException.class, () -> {
			 Functions.func3(5);
			 });
	}
	
}
