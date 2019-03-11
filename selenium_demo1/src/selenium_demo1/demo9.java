package selenium_demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo9 {
	
	@DataProvider(name="user")
	public Object[][] Users(){
	return new Object[][]{
	{"hujianming","hujianming123"},
	{"hujianming","hujianming"}
	};
	}
@Test(dataProvider="user")
	public static void main(String username ,String password) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
	String url="http://localhost:8080/examsys/index.thtml";
	System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.get(url);
driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td/input")).sendKeys(username);
driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys(password);
 WebElement a=driver.findElement(By.className("tm_select"));
Select select=new Select(a);
select.selectByIndex(2);
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
//WebElement b= driver.findElement(By.xpath("html/frameset/frameset/frame[1]"));
//driver.switchTo().frame(b);//进入框架
// String a1=driver.findElement(By.xpath("html/body/div/div[1]/h2")).getText();
//if(a1.equals("学生管理"))
//{//*[@id="menu"]
//	System.out.println("正常登入:");
//	 System.out.println("登录成功");
// }
// else
// {
//	 System.out.println("正常登入:");
//	 System.out.println("登录失败");
// }
try{
  	 Alert alert=driver.switchTo().alert();
	     alert.accept();
	     System.out.println("登入失败");
	   }
catch(Exception e){
		   System.out.println("登入成功");
	   }
}
	     
	}
