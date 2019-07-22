package SeleniumMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.june.july.batch.TestNG.LaunchBrowser;

public class SelectMultiselect extends LaunchBrowser {

	@Test
	public void selectDropdown() throws InterruptedException {

		driver.get("file:///Users/aravindanathdm/PycharmProjects/PythonSeleniumProject/Day12/praticepage.html");
		WebElement title = driver.findElement(By.xpath("//*[text()='Practice Page']"));
		System.out.println(title.getText());
		Assert.assertEquals(title.getText(), "Practice Page", "Title mis match!");
		WebElement ele = driver.findElement(By.id("multiple-select-example"));
		selectByVisibleTxt(ele, "Apple");
		selectByVisibleTxt(ele, "Orange");
		selectByVisibleTxt(ele, "Peach");

		Thread.sleep(2000);
		diSelectByVisTxt(ele, "Apple");
		diSelectByVisTxt(ele, "Orange");
		 

	}

	public void selectByVisibleTxt(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void diSelectByVisTxt(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

}
