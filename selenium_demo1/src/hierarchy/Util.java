package hierarchy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {
 static WebDriver driver;
	public void aa() {
		// TODO Auto-generated method stub
		String url="https://www.sina.com.cn/";
		System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(url);
	}

}
