package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class test1Test {

	@Before
	public  void setUp() throws Exception {
		System.out.println("1");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("2");
	}
	@Test
	public void testDiv() {
		//fail("Not yet implemented");
		test1 jun=new test1();
		int d=jun.div(4,2);
		assertEquals(6,d);
		assertNotEquals(3,d);
	}
//	@Ignore       //ºöÂÔ
//	public void testDiv1(){
//		System.out.println("4");
//	}

}
