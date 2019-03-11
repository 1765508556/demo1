package selenium_demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url="http://www.v2ex.com";
		 System.setProperty("webdriver.firefox.bin","E:\\火狐浏览器\\firefox.exe");
		 WebDriver driver=new FirefoxDriver();
			driver.get(url);
//			WebElement e=driver.findElement(By.id("kw"));
//			e.sendKeys("selenium");
//			e.sendKeys("怎么学");
//         	driver.findElement(By.id("kw")).sendKeys("selenium怎么学");
//			WebElement s=driver.findElement(By.id("su"));
//			s.click();
			//List <WebElement> elements=driver.findElements(By.className("tab"));
             driver.findElement(By.xpath(".//*[@id=\"SecondaryTabs\"]/a[1]")).click();
             List <WebElement> a=driver.findElements(By.className("page_normal"));
           
            String a1=a.get(3).getText();
            int a2=Integer.parseInt(a1);
            a.get(3).click();
            if(a2==5)
            {
            	System.out.println("现在处于第五页");
            }
            else
            {
            	a.get(3).click();
            }
}

}