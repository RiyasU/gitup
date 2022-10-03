package TestNGatributes;

import org.testng.annotations.Test;

public class T2 {
	
	@Test (timeOut=2000)
	public void r() throws InterruptedException
	{
		
		Thread.sleep(3000);
	}

}
