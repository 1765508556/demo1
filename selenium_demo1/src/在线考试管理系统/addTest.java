package ���߿��Թ���ϵͳ;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ���߿��Թ���ϵͳ.add;
public class addTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		add.a();
	    add.login();
	    add.add1();
	}  
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		add.delete();
		add.quit();
	}

	@Test
	public void testMain() {
		//fail("Not yet implemented");
		String a=add.look();
		String b=add.look1();
		String a1="С��";
		String b1="123456";
		assertEquals(a1,a);
		assertEquals(b1,b);
		
		
	}

}
