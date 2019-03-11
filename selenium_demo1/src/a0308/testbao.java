package a0308;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class testbao {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver;
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("C:\\Users\\Master\\AppData\\Local\\Google\\Chrome\\User Data");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new RemoteWebDriver(new URL("http://192.168.43.89:5555/wd/hub"),capabilities);
		String url="https:\\www.baidu.com";
		driver.get(url);
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
	}

}
