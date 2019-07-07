package recordVideos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.june.july.batch.TestNG.LaunchBrowser;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

/**
 * 
 * @author aravindanathdm Link to download jar:
 *         https://drive.google.com/file/d/0B6vnknygMB3IZVh3MWxnNUNfeEE/view
 *
 */
public class DemoScreenRecord extends LaunchBrowser {
	ATUTestRecorder recorder;

	@BeforeTest
	public void startRecord() throws ATUTestRecorderException {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		String path = System.getProperty("user.dir") ;//"/Users/aravindanathdm/eclipse-workspace/AutomationFrameworks/output/TestVideo"
		recorder = new ATUTestRecorder("/Users/aravindanathdm/eclipse-workspace/AutomationFrameworks/Output",
				"TestVideo-" + dateFormat.format(date), true);
		// To start video recording.
		recorder.start();

	}
	
	@Test
	public void test() {
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium jobs in banglare",Keys.ENTER);
	}
	
	
	
	@AfterTest
	public void stop() throws ATUTestRecorderException {
		
		recorder.stop();
	}
	

}
