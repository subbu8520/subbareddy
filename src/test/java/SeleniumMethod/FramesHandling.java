package SeleniumMethod;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.june.july.batch.TestNG.LaunchBrowser;

public class FramesHandling extends LaunchBrowser{
	
	
	@Test
	
	public void framea() {
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		
		driver.switchTo().frame("packageListFrame");
		String title =driver.findElement(By.xpath("/html/body/div[2]/h2")).getText();
		System.out.println(title);
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		
		String title2 =driver.findElement(By.xpath("/html/body/div[3]/h1")).getText();
		System.out.println(title2);
		
		
		
		
	}
	
	

}
