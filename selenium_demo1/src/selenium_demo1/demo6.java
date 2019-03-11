package selenium_demo1;

import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String url="https://www.sina.com.cn/";
		// System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
			System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
		 //WebDriver driver=new FirefoxDriver();
			WebDriver driver=new ChromeDriver();
			driver.get(url);
			driver.findElement(By.linkText("ÐÂÎÅ")).click();
			Set<String> w=driver.getWindowHandles();
			String currentWindow=driver.getWindowHandle();
			driver.switchTo().window(currentWindow);
			 String title=driver.getCurrentUrl();
			driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/h3")).click();
			driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/div[1]/div[2]/ul/li[4]")).click();
			WebElement e=driver.findElement(By.className("inp-txt"));
			e.sendKeys("java");
			 driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/form/input")).click();
	}
}
