package LOGS;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
	static Logger log= LogManager.getLogger(c1.class);
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		log.info("visited website");
		
		
		
	
		Thread.sleep(3000);
		ob.quit();
	
}

}
