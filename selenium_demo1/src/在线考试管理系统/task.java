package 在线考试管理系统;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static void a()
	{
		String url="http://localhost:8080/Exam_ssh/";
	    System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
		driver=new ChromeDriver();	
	    driver.get(url);
		driver.findElement(By.linkText("开始在线考试")).click();
	}
	public static void add()
	{  
		driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td/font[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td/font[4]/input")).sendKeys("小明");
		driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td/p[2]/input[1]")).click();
		
	}
	public static String b()
	{
		WebElement element=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/div/span/font/strong"));
		String a=element.getText();
		return a;
	}
	public static void c()
	{
		driver.quit();
	}

}
