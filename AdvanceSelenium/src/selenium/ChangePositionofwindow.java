package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePositionofwindow {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension D = new Dimension(500,500);
		driver.manage().window().setSize(D);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		Point p=new Point(500,600);
		Thread.sleep(2000);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.quit();

	}

}
