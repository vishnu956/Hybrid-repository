package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmessageofbuttonindemoapps {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1000);
		WebElement yesbutton = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		yesbutton.click();
		WebElement Message=driver.findElement(By.xpath("//span[contains(text(),'You selected \"Yes\"')]"));
		String text = Message.getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.quit();


	}

}
