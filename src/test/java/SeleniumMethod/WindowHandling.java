package SeleniumMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.june.july.batch.TestNG.LaunchBrowser;

public class WindowHandling extends LaunchBrowser{
	
	
	@Test
	public void windowsHandling() throws InterruptedException {
		
		driver.get("https://www.hdfcbank.com/");
		try {
			driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		System.out.println("========= Parent Window ===========");
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterate = windowId.iterator();
		System.out.println("First window ID " + iterate.next());

		driver.findElement(By.xpath("(//*[@id='loginsubmit'])[1]")).click();

		System.out.println("========Second Window opens========");
		windowId = driver.getWindowHandles();
		iterate = windowId.iterator();
		
		String firstwindow=iterate.next(); //window id of the main window
		String SecondWindow=iterate.next();  

		
		//tabbed window
		System.out.println("Second window ID " + SecondWindow);
		 
		
		driver.switchTo().window(SecondWindow);
		System.out.println("======== Foucs is on Second Window ========");
		windowId = driver.getWindowHandles();
		iterate = windowId.iterator();
		
		String title1 =  driver.getTitle();
		System.out.println("Title: "+ title1);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.close(); // latest window pop up
		driver.switchTo().window(firstwindow);
		System.out.println("Title: " + title);
		driver.quit();;
	}

}
