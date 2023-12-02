package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class BaseWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vishn/OneDrive/Desktop/DummyData.html");
		Thread.sleep(2000);
		WebElement text1= driver.findElement(By.tagName("input"));
		text1.sendKeys("Hello");
		Thread.sleep(1000);
		text1.clear();
		Thread.sleep(1000);
		WebElement text2= driver.findElement(By.id("text-field"));
		text2.sendKeys("world");
		Thread.sleep(1000);
		text2.clear();
		Thread.sleep(1000);
		WebElement text3=driver.findElement(By.className("c1"));
		text3.click();
		Thread.sleep(1000);
		text3.click();
		Thread.sleep(1000);
		WebElement text4=driver.findElement(By.name("n1"));
		text4.click();
		Thread.sleep(1000);
		text4.click();
		Thread.sleep(1000);
		driver.quit();
		

		
		
		



		

	}

}
