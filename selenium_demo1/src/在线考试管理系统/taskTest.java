package ���߿��Թ���ϵͳ;

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
		String a1="��ӭ�������߿���ϵͳ";
		assertEquals(a1,d);
	}

}
