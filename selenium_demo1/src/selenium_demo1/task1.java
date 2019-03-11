package selenium_demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url="https://www.126.com";
		 System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get(url);
		 WebElement f=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div[3]/div/div/iframe"));
		 driver.switchTo().frame(f);
		 driver.findElement(By.name("email")).click();
		 driver.findElement(By.name("email")).sendKeys("l1765508556");
		 driver.findElement(By.name("password")).click();
		 driver.findElement(By.name("password")).sendKeys("1015045715");
		 driver.findElement(By.xpath("//div[@class='f-cb loginbox']/a")).click();
	}

}