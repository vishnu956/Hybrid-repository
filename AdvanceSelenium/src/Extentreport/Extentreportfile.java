package Extentreport;



import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Extentreportfile {
	public static WebDriver driver;
	@Test
	public void testscript() throws InterruptedException, IOException
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/executionreport.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest test=reports.createTest("Extent Example").assignAuthor("Vishnu");
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver =new FirefoxDriver();
		test.log(Status.INFO,"Firefox Browser is Successfully Launched");
		driver.get("https://www.zomato.com");
		test.log(Status.INFO,"Application under test is launched successfully");
		Thread.sleep(1000);
		String title=driver.getTitle();
		if(title.equals("Zoma"))
		{
			test.log(Status.PASS,"Home page is displayed");
		}
		else
		{
			test.log(Status.FAIL,"Home page is not displayed,blocker");
			test.addScreenCaptureFromPath(screenshot());
		}
		Thread.sleep(1000);
		reports.flush();
		driver.quit();
	}
	public static String screenshot() throws IOException
	{
		String path="C:\\Users\\vishn\\OneDrive\\Desktop\\defect screenshots\\defect.png";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(path);
		FileHandler.copy(src, dst);
		return "."+path;
	
		

		

	}

}
