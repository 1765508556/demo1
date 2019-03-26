package baidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.baidu.com/";
		System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
	}

}
