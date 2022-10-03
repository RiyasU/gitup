package TestNGatributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Realtime {
	
	ChromeDriver ob;
	
	@Test(priority=0,description="visinting website",groups="P")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 ob=new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1,description="maximising website",groups="P")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshing website",invocationCount=3,groups="P")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking",dependsOnGroups="P")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
		
	}
	
	@Test(priority=4,description="closing",timeOut=3000,dependsOnGroups="P")
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}
	
	

}
