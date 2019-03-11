package selenium_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class мою╜ {
	public static void main(String[] args) {
	String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/selenium/selenium_html/dragAndDrop.html";
	System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	WebElement element =driver.findElement(By.id("drag"));
	WebElement target = driver.findElement(By.xpath("/html/body/h1"));
	//(new Actions(driver)).dragAndDrop(element, target).perform();
    Actions action=new Actions(driver);
	action.dragAndDropBy(element,-190,-30).perform(); 
	}
}
