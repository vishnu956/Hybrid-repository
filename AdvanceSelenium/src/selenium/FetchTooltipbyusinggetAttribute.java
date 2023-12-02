package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTooltipbyusinggetAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		WebElement Kannada=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String tooltip = Kannada.getAttribute("title");
		String link = Kannada.getAttribute("href");
		System.out.println(tooltip);
		System.out.println(link);
		Thread.sleep(1000);
		driver.quit();

	}

}
