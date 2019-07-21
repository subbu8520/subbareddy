package SeleniumMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.june.july.batch.TestNG.LaunchBrowser;

public class ActionsExample extends LaunchBrowser {

	//@Test
	public void mouseHoverAmazon() throws InterruptedException {

		driver.get("https://www.amazon.in");

		WebElement cat = driver.findElement(By.xpath("//span[contains(text(),'Category')]"));
		// rightClick(cat);
		mouseHover(cat);
		WebElement kindle = driver.findElement(By.xpath("//span[contains(text(),'Kindle E-Readers & eBooks')]"));
		mouseHover(kindle);
		driver.findElement(By.xpath("//span[contains(text(),'All-new Kindle')]")).click();
		Thread.sleep(3000);

	 driver.quit();

	}

	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement src1 = driver.findElement(By.xpath("(//*[@id='fourth']/a)[1]"));
		WebElement tgt1 = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		WebElement src2 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement tgt2 = driver.findElement(By.xpath("//*[@id=\"bank\"]"));

		dragNDropElement(src1, tgt1);
		Thread.sleep(1000);
		dragNDropElement(src2, tgt2);
		Thread.sleep(2000);
		driver.quit();
	}

	public void dragNDropElement(WebElement src, WebElement tgt) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, tgt).build().perform();
	}

	public void mouseHover(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public void rightClick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
		;
	}

}
