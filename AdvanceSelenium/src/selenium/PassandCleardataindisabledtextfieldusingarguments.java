package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassandCleardataindisabledtextfieldusingarguments {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vishn/OneDrive/Desktop/disabledelement.html");
		Thread.sleep(1000);
		WebElement disabled=driver.findElement(By.id("textfield"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='ABC'",disabled);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value=''",disabled);
		Thread.sleep(1000);
		driver.quit();

	}

}
