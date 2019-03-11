package junit.junit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class test1Test {
	@DataProvider
	public Object[][] user(){
		return new Object[][]{
			{"zhangsan","12"},{"lisi","18"}
		};
	}
  
  @BeforeMethod
  public void beforeMethod() {
	 //System.out.println("1");
  }

  @AfterMethod
  public void afterMethod() {
	 // System.out.println("2");
  }

  @BeforeClass
  public void beforeClass() {
	  //System.out.println("3");
  }

  @AfterClass
  public void afterClass() {
	  //System.out.println("4");
  }

  @BeforeTest
  public void beforeTest() {
	 // System.out.println("5");
  }

  @AfterTest
  public void afterTest() {
	 // System.out.println("6");
  }

  @BeforeSuite
  public void beforeSuite() {
	 // System.out.println("7");
  }

  @AfterSuite
  public void afterSuite() {
	 // System.out.println("8");
  }
  
  @Parameters("test")
//  @Test
  @Test(dataProvider="user")
  public void main(String name,String age) {
	  System.out.println(name+age);
	  //System.out.println(test);
    //throw new RuntimeException("Test not implemented");
//	  int a=1;
//	  Assert.assertEquals(1, a);//比较是否相等
  }
//  @Test //(dependsOnMethods="main")//关联main函数
//  public void main1() {
//	 System.out.println("Test1");
//    //throw new RuntimeException("Test not implemented");
//  }
}
