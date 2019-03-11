package 百度登入界面;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu_login {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	}
	public static void login() throws InterruptedException, IOException
	{
		String url="https://www.baidu.com/";
		System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__userName']")).sendKeys("345357357");
		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__password']")).sendKeys("357373573");
		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__submit']")).click();
		Thread.sleep(15000);
		String a=driver.findElement(By.id("TANGRAM__PSP_10__error")).getText();
		System.out.println(a);
		String a1="帐号或密码错误，请重新输入或者找回密码";
	if(a.equals(a1))
			{
		   File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(file, new File("D:/test.png"));
	       driver.findElement(By.id("TANGRAM__PSP_10__userName_clearbtn")).click();
	        driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__userName']")).sendKeys("18879561968");
			driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__password']")).sendKeys("1765508556");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__submit']")).click();
			}

	}
	public static String user() throws InterruptedException
	{
		Thread.sleep(10000);
		String a=driver.findElement(By.id("s_username_top")).getText();
		System.out.println("a");
		return a;
	}
	public static void quit()
	{
		driver.quit();
	}
}
