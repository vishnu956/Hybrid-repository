package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getfontsizeoftext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement text =driver.findElement(By.xpath("//div[contains(text(),' for a celebrity')]"));
		String font=text.getCssValue("font-size");
		System.out.println(font);
		Thread.sleep(1000);
		driver.quit();
	}


}
