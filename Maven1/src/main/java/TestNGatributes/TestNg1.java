package TestNGatributes;

import org.testng.annotations.Test;

public class TestNg1 {
	
	
	@Test(priority=0,description="RIYAS",invocationCount=3,groups="X",enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	@Test (priority=1,description="RIYAS")
	public void m3()
	{
		System.out.println("Test case 2");
	}
	@Test(priority=2,description="RIYAS",groups="Y")
	public void m2()
	{
		System.out.println("Test case 3");
	}

}
