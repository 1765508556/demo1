package selenium_demo1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String url="https://www.baidu.com/";
				System.setProperty("webdriver.chrome.driver", ".//Tools//chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get(url);
				String b="µÇÂ¼";
				WebElement a=driver.findElement(By.xpath("//*[@id='u1']/a[7]"));
				String a1=a.getText();
				if(!b.equals(a1))
					{
						Set<Cookie> coo = driver.manage().getCookies();
						System.out.println(coo);
					}
				else
				{
				a.click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__footerULoginBtn']")).click();
				driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__userName']")).sendKeys("18879561968");
				driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__password']")).sendKeys("1765508556");
				driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__submit']")).click();
				Thread.sleep(20000);
				Set<Cookie> coo = driver.manage().getCookies();
				System.out.println(coo);
				}
	}
}
 