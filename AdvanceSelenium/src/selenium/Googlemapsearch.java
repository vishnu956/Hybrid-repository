package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlemapsearch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9794048,77.6208384,12z?entry=ttu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Choose starting point, or click on the map...')]")).sendKeys("Rajajinagar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Starting point Rajajinagar')]/../../../button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@tooltip,'Choose destination, or click')]")).sendKeys("Marathalli");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Destination Marathalli')]/../../../button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Details']")).click();
		Thread.sleep(3000);


	}

}
