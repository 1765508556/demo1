package selenium_demo1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/新建文件夹/pop.html");
		driver.findElement(By.id("goo")).click();
		Set<String> w=driver.getWindowHandles();		
		String c=driver.getWindowHandle();		
		String url="http://www.baidu.com";
		for(String handle:w)//随机取一个句柄
		{
			String title=driver.getCurrentUrl();//获取标题
			System.out.println(title);
			if(!handle.equals(c)){
//				int a=10;
			driver.switchTo().window(handle);
				System.out.println("百度页面");
				WebElement e=driver.findElement(By.id("kw"));
				e.sendKeys("李威");
				driver.findElement(By.id("su")).click();
				
				break;
			}

	}
		
	}
}
