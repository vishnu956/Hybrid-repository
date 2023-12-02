package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchinYoutube {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("ghost trailer");
		Thread.sleep(1000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Ghost Official Trailer | Dr.Shivarajkumar, Anupam Kher, Jayaram, Prashant Narayanan | Sandesh |Srini")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
