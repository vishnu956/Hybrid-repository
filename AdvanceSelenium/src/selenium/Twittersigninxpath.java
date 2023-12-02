package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twittersigninxpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Vishnusams");
		Thread.sleep(3000);
		driver.quit();

		// TODO Auto-generated method stub

	}

}
