package seleniumPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.june.july.batch.TestNG.LaunchBrowser;

public class ByID extends LaunchBrowser{
	
	@Test
	public void locateByID() {
		driver.manage().window().fullscreen();
		driver.get("http://www.amazon.com");
		String title =driver.getTitle();
		System.out.println(title);
	//	driver.findElement(By.className("pl-login-ornage-box")).click();
		
		
	}

}
