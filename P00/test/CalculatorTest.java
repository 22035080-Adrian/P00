import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author adrian
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}

	@Test
	public void testSubtract() {
		int a = 1234;
		int b = 1000;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 234;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 150;
		int b = 17;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 2550;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 150;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 30;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
