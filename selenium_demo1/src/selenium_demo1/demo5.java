package selenium_demo1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/�½��ļ���/pop.html");
		driver.findElement(By.id("goo")).click();
		Set<String> w=driver.getWindowHandles();		
		String c=driver.getWindowHandle();		
		String url="http://www.baidu.com";
		for(String handle:w)//���ȡһ�����
		{
			String title=driver.getCurrentUrl();//��ȡ����
			System.out.println(title);
			if(!handle.equals(c)){
//				int a=10;
			driver.switchTo().window(handle);
				System.out.println("�ٶ�ҳ��");
				WebElement e=driver.findElement(By.id("kw"));
				e.sendKeys("����");
				driver.findElement(By.id("su")).click();
				
				break;
			}

	}
		
	}
}
