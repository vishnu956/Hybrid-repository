package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement loginbtn=driver.findElement(By.name("login"));
		File temp_mem = loginbtn.getScreenshotAs(OutputType.FILE);
		File perm_mem = new File("C:\\Users\\vishn\\OneDrive\\Desktop\\defect screenshots\\facebook.png");
		FileHandler.copy(temp_mem, perm_mem);
		driver.quit();

	}

}
