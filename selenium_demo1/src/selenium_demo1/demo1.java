package selenium_demo1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 name();
//		try{
//			  String url="http://www.baidu.com";
//				System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
//				WebDriver driver=new FirefoxDriver();
//				driver.get(url);
//				System.out.println(driver.getTitle());
////				if(url.equals("http://www.baidu.com"))
////				{
////					System.out.println(driver.getTitle());
////				}
//		}
//		catch(Exception e)
//		{
//			String url="http://www.baidu.com";
//			System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
//			WebDriver driver=new FirefoxDriver();
//			driver.get(url);
//		}
//		driver.get("http://www.baidu.com");
//		driver.navigate().back();//ºóÍË
//		driver.navigate().forward();//Ç°½ø
//		Dimension dimension =new Dimension(200,200);
//		driver.manage().window().setSize(dimension);	
	}
	public static void name()
	{
		    String url="http://www";
			System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Ò³ÃæÔØÈë³ö´í"))
			{
//				System.setProperty("webdriver.firefox.bin","E:\\»ðºüä¯ÀÀÆ÷\\firefox.exe");
				String url2="http://www.baidu.com";
//				WebDriver driver1=new FirefoxDriver();
				driver.get(url2);
				 
			}
	}
}










