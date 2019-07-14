package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.june.july.batch.TestNG.LaunchBrowser;

public class ActionsExample extends LaunchBrowser {

	@Test
	public void mouseHoverAmazon() throws InterruptedException {

		driver.get("https://www.amazon.in");

		WebElement cat = driver.findElement(By.xpath("//span[contains(text(),'Category')]"));
		mouseHover(cat);
		WebElement kindle = driver.findElement(By.xpath("//span[contains(text(),'Kindle E-Readers & eBooks')]"));
		mouseHover(kindle);
		driver.findElement(By.xpath("//span[contains(text(),'All-new Kindle')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

	public void mouseHover(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

}
