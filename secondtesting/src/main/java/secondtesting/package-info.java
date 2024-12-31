package secondtesting;

public class secondtest{
	public static void main(String args[])
	{
		ChromeDriver driver=new ChromeDriver;
		driver.get("https://www.amazon.in/");
		String act=driver.getTitle();
		if(act.equals("Mobiles"))
		{
			System.out.println("testing passed");
		}
		else
		{
			java.lang.System.out.println("testing failed");
		}
		
		
	}
}