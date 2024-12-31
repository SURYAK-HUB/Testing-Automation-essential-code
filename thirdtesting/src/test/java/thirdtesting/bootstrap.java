package thirdtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bootstrap {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://bootstrapmade.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a/span")).click();
		Boolean dri=driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a")).isSelected();
		System.out.println(dri);
		
		
		
		
		
	
	
	
	
	}


}
