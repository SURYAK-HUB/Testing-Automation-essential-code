package thirdtesting;
import org.testng.annotations.Test;

public class testnewgen {
	
	@Test(priority=3)
	void openapp()
	{
		System.out.println("Open");
	}
	
	@Test(priority=1)
	void login()
	{
		System.out.println("LOgin");
		
	}
	

}
