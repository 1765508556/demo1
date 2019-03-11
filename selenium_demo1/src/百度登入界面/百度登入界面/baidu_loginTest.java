package 百度登入界面.百度登入界面;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterSuite;
  
public class baidu_loginTest {
	static WebDriver driver;
	@BeforeSuite
	  public void beforeSuite() {
		  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.baidu.com");
				driver.findElement(By.linkText("登录")).click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
	  }

	  @AfterSuite
	  public void afterSuite() {
		  driver.quit();
	  }

	  @DataProvider(name="user")
	  public Object[][] Users(){
	  return new Object[][]{
	  {"agdsdfhfsdh","a123456"},
	  {"18879561968","1765508556"},
	  };
	  }
	  
	  @Test(dataProvider="user")
	  public void main(String username,String password) {
		  driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys(username);
		  driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys(password);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.id("TANGRAM__PSP_10__userName")).clear();
			driver.findElement(By.id("TANGRAM__PSP_10__password")).clear();
	        if(driver.findElement(By.id("TANGRAM__PSP_10__error")).isDisplayed())
	        {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String a=driver.findElement(By.id("TANGRAM__PSP_10__error")).getText();
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file,new File("D:/5.jpg"));
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			}
	        //Assert.assertEquals("ture",ming.findElement(By.id("TANGRAM__PSP_10__error")).isDisplayed());
		}
	}