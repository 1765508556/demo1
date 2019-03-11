package selenium_demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String url="http://www.v2ex.com";
		 System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
		 WebDriver driver=new FirefoxDriver();
			driver.get(url);
		//driver.get("http://www.baidu.com");
       File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(file, new File("D:/test.png"));
//       try{
//    	  FileUtils.copyFile(file, new File("D:/test.png"));
//       }catch(IOException e){
//    	   e.printStackTrace();
//       }
	}
}
