package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class3 {
	
	@Test(groups="three")
	public void T3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("https:www.facebook.com");
		
		ob.findElementByPartialLinkText("Forgotten").click();
		Thread.sleep(3000);
		ob.quit();
	}

}
