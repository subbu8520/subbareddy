package recordVideos;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

/**
 * 
 * @author aravindanathdm
 *
 *         <dependency> <groupId>ru.yandex.qatools.ashot</groupId>
 *         <artifactId>ashot</artifactId> <version>1.5.4</version> </dependency>
 * 
 *         
 */

public class TakeScreenShots {

	static WebDriver driver;

	@BeforeTest
	public void openBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		// Page load
		// driver.get("https://www.wikipedia.org/");
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(description = "Invalid Login Scenario with wrong username and password.")
	public void homePage() throws Exception {

		takeNormalScreenShot();
		takeFullSceenshot();

	}

	/**
	 * @author aravindanathdm This method will take fullscreen screenshot.
	 * @param webdriver
	 * @throws Exception
	 */

	public String screenShot() throws IOException {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		Date d = new Date();
		System.out.println(d);
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		String path = "/Users/aravindanathdm/eclipse-workspace/AutomationFrameworks/Output/";
		String filePath = path + screenshotFile;
		ImageIO.write(screenshot.getImage(), "PNG", new File(filePath));
		return path;
	}

	public static void takeFullSceenshot() throws IOException {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		Date d = new Date();
		String trim = d.toString().replace(":", "_").replace(" ", "_") + ".PNG";
		String filePath = "./Output/demo" + trim;
		ImageIO.write(screenshot.getImage(), "PNG", new File(filePath));

	}

	/**
	 * @author aravindanathdm This method will take screenshot of focus screen only
	 * @param webdriver
	 * @throws Exception
	 */
	public static void takeSnapShot(WebDriver driver) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		System.out.println(d);
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		String path = "/Users/aravindanathdm/eclipse-workspace/AutomationFrameworks/Output/";
		String filePath = path + screenshotFile;
		// Move image file to new destination
		File DestFile = new File(filePath);
		// Copy file at destination
		Files.copy(SrcFile, DestFile);

	}

	/**
	 * @author aravindanathdm This method takes fullscreen shot
	 * @return
	 * @throws IOException
	 */
	public String captureScreen() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = "/Users/aravindanathdm/eclipse-workspace/AutomationFrameworks/Output/" + getcurrentdateandtime()
				+ ".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
	}

	public static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception e) {

		}
		return str;
	}

	public static void takeNormalScreenShot() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = "./Output/" + getcurrentdateandtime() + ".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
	}

}
