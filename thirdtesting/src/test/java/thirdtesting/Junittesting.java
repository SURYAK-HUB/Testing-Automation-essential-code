package thirdtesting;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Junittesting {
		public static void main(String args[])
		{
			ChromeDriver driver1=new ChromeDriver();
			WebDriver driver=new ChromeDriver();
			/*driver.get("https://www.amazon.in/");
			String act=driver.getTitle();
			if(act.equals("Mobiles"))
			{
				System.out.println("testing passed");
			}
			else
			{
				java.lang.System.out.println("testing failed");
			}*/
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
			//driver.findElement(By.name("search")).sendKeys("Samsung");
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println("total"+links.size());
		}
	

}
