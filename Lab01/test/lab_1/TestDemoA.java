package lab_1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestDemoA {
	private int input ;
	private int expected ;
	private Solution sol;
	
	public TestDemoA(int input, int expected) {
		this.input = input ;
		this.expected = expected ;
	}
	
	@Before
	public void setUp() {
		this.sol = new Solution() ;
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{77,1},
			{101,-1},
			{44,-1},
			{0,1}
		});
	}
	
	@Test
	public void testFunc() {
		assertEquals(this.expected, sol.number(input)) ;
	}
}
