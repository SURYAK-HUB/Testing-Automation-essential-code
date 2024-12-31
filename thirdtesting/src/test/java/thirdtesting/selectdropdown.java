package thirdtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountryele=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select drpCountry =new Select(drpcountryele);
		//drpCountry.selectByVisibleText("France");
		//drpCountry.selectByIndex(3);
		List<WebElement>  options=drpCountry.getOptions();
		System.out.println("NUmber:"+options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		
		
	
	
	
	
	}


}
