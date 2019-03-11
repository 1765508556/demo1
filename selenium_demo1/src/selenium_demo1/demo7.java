package selenium_demo1;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo7 {

	private static final Boolean True = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/selenium_html/demo1.html";
		System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get(url);
		driver.findElement(By.id("user")).sendKeys("java");
		driver.findElement(By.linkText("baidu")).click();
		driver.navigate().back();
		WebElement element=driver.findElement(By.name("select"));
		Select select=new Select(element);
		select.selectByIndex(2);
		driver.findElement(By.xpath("//*[@id='radio']/input[2]")).click();
		driver.findElement(By.xpath("//*[@id='checkbox']/input[1]")).click();
		driver.findElement(By.xpath("//*[@id='checkbox']/input[2]")).click();
		driver.findElement(By.xpath("//*[@id='checkbox']/input[3]")).click();
		driver.findElement(By.xpath("//*[@id='checkbox']/input[4]")).click();
		Boolean bl=driver.findElement(By.xpath("//*[@id='button']/input")).isDisplayed();
		Assert.assertTrue(bl);
		if(bl==True) {
			driver.findElement(By.xpath("//*[@id=\\\"button\\\"]/input")).click();
		}else {
			System.out.println("无法点击");
		}

		driver.findElement(By.xpath("//*[@id='alert']/input")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id("load")).sendKeys("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt");
		driver.findElement(By.xpath("//*[@id='open']/a")).click();		
		String currentWindow=driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='wait']/input")).click();
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id='action']/input"))).perform();//鼠标悬停
		Thread.sleep(5000);
		String b=driver.findElement(By.xpath("//*[@id='display']/div")).getText();
		System.out.println(b);
	}
}
