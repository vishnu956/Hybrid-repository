package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookcelebrityfollow {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9108674854");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("Johnny Depp");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(@class,'x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x6prxxf') and contains(text(),'Johnny')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(@class,'x1lliihq x6ikm8r x10wlt6') and text()='Follow']")).click();
		Thread.sleep(3000);
		driver.quit();


		// TODO Auto-generated method stub

	}

}
