package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Takescreenshotondemowebshop1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vishnuk2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		Thread.sleep(1000);
		WebElement option1 = driver.findElement(By.id("products-orderby"));
		Thread.sleep(1000);
        Select sel = new Select(option1);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		WebElement option2 = driver.findElement(By.id("products-pagesize"));
		Thread.sleep(1000);
		Select sel1 = new Select(option2);
		sel1.selectByIndex(2);
		Thread.sleep(1000);
		WebElement option3 = driver.findElement(By.id("products-viewmode"));
		Thread.sleep(1000);
		Select sel2 = new Select(option3);
		sel2.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Rockabilly Polka Dot')]/../../div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		WebElement notification=driver.findElement(By.xpath("//div[@id='bar-notification']"));
		Thread.sleep(1000);
		boolean display=notification.isDisplayed();
		if(display)
		{
			System.out.println("Got Notification");
		}
		else
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp_mem = ts.getScreenshotAs(OutputType.FILE);
			File perm_mem = new File("C:\\Users\\vishn\\OneDrive\\Desktop\\defect screenshots\\Demoapps1.png");
			FileHandler.copy(temp_mem, perm_mem);
        }
		Thread.sleep(1000);
		driver.quit();
	}

}
