package 在线考试管理系统;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class add {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        a();
        login();
        add1();
        System.out.println(look()); 
        delete();
        quit();
	}
   public static void a()
   {
	  
			String url="http://localhost:8080/Exam_ssh/";
		    System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
			driver=new ChromeDriver();	
		    driver.get(url);
			driver.findElement(By.linkText("进入后台管理")).click();
   }
   public static void login()
   {
	   driver.findElement(By.id("name")).sendKeys("admin");
	   driver.findElement(By.id("pass")).sendKeys("admin");
	   driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td/p[2]/input[1]")).click();
   }
   public static void add1()
   {
	   driver.findElement(By.xpath("//*[@id='studentChild']/a[2]")).click();
	   driver.findElement(By.id("id")).sendKeys("123456789");
	   driver.findElement(By.id("realname")).sendKeys("小明");
	   driver.findElement(By.id("stuNumber")).sendKeys("123456");
	   driver.findElement(By.id("className")).sendKeys("170306");
	   driver.findElement(By.xpath("//*[@id='table14']/tbody/tr/td[1]/div/input")).click();   
   }
   public static String look()
   
   {
	 
	   driver.findElement(By.xpath("//*[@id='studentChild']/a[1]")).click();
	String a=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/div")).getText();
	return a;
   }
   public static String look1()
   {
	   String b=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[4]/div")).getText();
	return b;
   }
   public static void delete()
   {
	   driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[6]/div/a")).click();
//	   Actions builder = new Actions(driver);
	   Alert alert=driver.switchTo().alert();
	   alert.accept();
	   driver.navigate().back();
   }
   public static void quit()
   {
	   driver.quit();
   }
}
