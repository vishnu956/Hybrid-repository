package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XaxisandYaxisofLocation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
	    WebElement aus=driver.findElement(By.linkText("Australia"));
		Thread.sleep(1000);
		Point loc = aus.getLocation();
		Thread.sleep(1000);
		int x=loc.getX();
		int y=loc.getY();
		Thread.sleep(1000);
		System.out.println(x+""+y);
		System.out.println(loc);
		Thread.sleep(1000);
		driver.quit();

	}

}
