package lab_1;

import static org.junit.Assert.* ;
import org.junit.Test;

public class TestDemo {
	
	private Solution sol = new Solution() ;
	
	@Test
	public void TestPrint() {
		assertEquals(1, sol.number(77)) ;
		assertEquals(-1, sol.number(101)) ;
		assertEquals(-1, sol.number(44)) ;
		assertEquals(1, sol.number(0)) ;
	}
}

