package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetheightandwidhtwithoutusingCSSvalue {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement login_btn =driver.findElement(By.name("login"));
		Dimension size=login_btn.getSize();
		int H=size.getHeight();
		int W=size.getWidth();
		System.out.println(H);
		System.out.println(W);
		Thread.sleep(1000);
		driver.quit();

	}

}
