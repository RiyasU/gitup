package dataproviderr;


	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;


	public class datapro {

	   ChromeDriver driver;
	   
	   // Data provider - helps with data driven test cases that cary same method but
	   //                  run multiple times with different data sets

	   @DataProvider(name = "dhivya")
	   public static Object[][] DataSet(){
	       // arrayname[row][col]
	       Object[][] obj = {
	               {"valid", "benazrifa@gmail.com", "riazri"},//row   00   01  02
	               {"invalid", "rrr", "9999"},             //row   10   11  12
	               {"in", "yyyy","8888"}
	               };
	       return obj;
	   }

	   @Test(dataProvider = "dhivya")// we made the cnnection    
	   
	   public void DataProvSampleTest(String type, String username, String password) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     
	       driver = new ChromeDriver();

	       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	       driver.get("https://www.facebook.com");

	       
	       // login (used for both valid and invalid case)
	       driver.findElementById("email").sendKeys(username);
	       driver.findElementByName("pass").sendKeys(password);
	      driver.findElementByName("login").click();

	       if(type.equals("valid")){
	           System.out.println("in home");
	           driver.findElementByLinkText("Log Out").click();
	           
	       }else
	           System.out.println("invaliduser");

	       Thread.sleep(2000);
	       driver.quit();
	   }

	}



