package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passusernamepasswordbyfetchingsingleelement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	    WebElement username=driver.findElement(By.id("email"));
	    username.sendKeys("Hello World",Keys.TAB,"Hi@1234",Keys.TAB,Keys.ENTER);
	    Thread.sleep(1000);
	    driver.quit();

	}

}
