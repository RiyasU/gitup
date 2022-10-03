package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {
	
	@Test(groups="two")
	
	public void T2() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https:www.facebook.com");
		
		ob.findElementById("email").sendKeys("benazrifa@gmail.com");
	    ob.findElementByName("pass").sendKeys("12345");
	    ob.findElementByName("login").click();
	    Thread.sleep(3000);
	    ob.quit();
}
	}

