package 百度登入界面;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.DataProvider;

public class baidu_loginTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		baidu_login.login();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		baidu_login.quit();
	}
	
	
	@Test
	public void test(String a,String b) throws InterruptedException {
//		fail("Not yet implemented");
		baidu_login.user();
	
	}

}
