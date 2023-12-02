package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.Takescreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Newscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp_mem = ts.getScreenshotAs(OutputType.FILE);
		File perm_mem = new File("C:\\Users\\vishn\\OneDrive\\Desktop\\defect screenshots\\Demoapps.png");
		FileHandler.copy(temp_mem, perm_mem);
        Thread.sleep(1000);
        driver.quit();


	}

}
