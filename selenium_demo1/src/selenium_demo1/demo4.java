package selenium_demo1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		String url="file:///C:/Users/Administrator/Desktop/�½��ļ���/dialogs.html";
		String url="https://www.cnblogs.com/";
		System.setProperty("webdriver.firefox.bin","E:\\��������\\firefox.exe");//ѡ�������
		WebDriver driver=new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get(url);//������ַ
//		driver.findElement(By.id("alert")).click();//���alert��ť
//		Thread.sleep(1000);//�ȴ�1��
//		Alert alert=driver.switchTo().alert();//ѡ��alert����
//		alert.accept();//���ȷ��
//		driver.findElement(By.id("confirm")).click();
//		Thread.sleep(1000);
//		Alert alert1=driver.switchTo().alert();
//		alert1.dismiss();//���ȡ��
//		driver.findElement(By.id("prompt")).click();
//		Thread.sleep(1000);
//		Alert alert2=driver.switchTo().alert();
//		alert2.sendKeys("С��");//��������
//		alert2.accept();
//		WebElement a=driver.findElement(By.xpath("/html/body"));
//		String a1=a.getText();
//		System.out.println(a1);
//		driver.findElement(By.id("input1"));
//		WebElement s=driver.findElement(By.id("cate_item_2"));
//		s.clickAndHold();
		builder.moveToElement(driver.findElement(By.id("cate_item_2"))).perform();
		driver.findElement(By.linkText("Java(12)")).click();
		WebElement a=driver.findElement(By.id("zzk_q"));
		a.click();
		a.sendKeys("java");
         driver.findElement(By.className("search_btn")).click();
         Thread.sleep(10000);
        WebElement b=driver.findElement(By.id("searchInfo"));
		String b1=b.getText();
		System.out.println("��ѯ�����"+b1);
		WebElement c=driver.findElement(By.id("CountOfResults"));
		String c1=c.getText();
		int c2 = Integer.parseInt(c1);
		if(c2==0)
		{
			File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		       FileUtils.copyFile(file, new File("D:/test.png"));
		}
		else
		{
			System.out.println("�������Ϊ��"+c1);
		}
		driver.findElement(By.className("top_tabs")).click();
		WebElement e=driver.findElement(By.className("titlelnk"));
		String e1=e.getText();
		System.out.println("��һ����¼�ı��⣺"+e1);
	}

}
