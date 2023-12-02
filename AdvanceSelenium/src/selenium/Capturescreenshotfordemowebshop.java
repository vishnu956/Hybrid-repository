package selenium;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Takescreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Capturescreenshotfordemowebshop {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Rockabilly Polka Dot Top JR Plus Size')])[2]/../../div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		WebElement message=driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your')]"));
		Thread.sleep(1000);
		boolean success=message.isDisplayed();
		if(success){
			System.out.println("ADDED TO CART");
		}
		else
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp_mem = ts.getScreenshotAs(OutputType.FILE);
			File perm_mem = new File("C:\\Users\\vishn\\OneDrive\\Desktop\\defect screenshots\\Demoapps.png");
			FileHandler.copy(temp_mem, perm_mem);

		}
         Thread.sleep(1000);
         driver.quit();


	}

}
