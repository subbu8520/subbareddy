package SeleniumMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author aravindanathdm
 * 
 *
 */

public class VerifyDropDownSorted {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.wikipedia.org/");

		/**
		 * 
		 */

		WebElement ele = driver.findElement(By.id("searchLanguage"));
		Select sc = new Select(ele);
		// Temp list with original values

		List originalList = new ArrayList();

		List<WebElement> option = sc.getOptions();

		for (WebElement e : option) {

			originalList.add(e.getText());
		}

		System.out.println("Original List:" + originalList);

		Collections.sort(originalList);

		System.err.println("Sorted List:" + originalList);

		driver.close();
	}

}
