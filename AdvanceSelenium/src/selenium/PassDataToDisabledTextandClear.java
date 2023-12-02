package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataToDisabledTextandClear {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vishn/OneDrive/Desktop/disabledelement.html");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('textfield').value='ABC'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('textfield').value=''");
		Thread.sleep(1000);
		driver.quit();

	}

}
