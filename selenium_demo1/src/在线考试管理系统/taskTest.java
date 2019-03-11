package 在线考试管理系统;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.test1;

public class taskTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		task.a();
		task.add();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		task.c();
	}

	@Test
	public void testMain() {
		//fail("Not yet implemented");
		
		String d=task.b();
		String a1="欢迎光临在线考试系统";
		assertEquals(a1,d);
	}

}
