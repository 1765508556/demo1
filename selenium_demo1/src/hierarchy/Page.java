package hierarchy;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page extends Util {
	static WebElement a;
	static WebElement b;
	static WebElement c;
	static WebElement d;
	static WebElement e;
	public void  bb() {
		// TODO Auto-generated method stub
		a=driver.findElement(By.name("SerchKey"));
		b=driver.findElement(By.name("SearchSubButton"));
		d=driver.findElement(By.id("sim-ul-bg"));
	}

}
