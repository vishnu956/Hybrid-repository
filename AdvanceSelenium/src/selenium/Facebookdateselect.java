package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdateselect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);
		WebElement dropdown=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Thread.sleep(1000);
		Select sel=new Select(dropdown);
		Thread.sleep(1000);
		sel.selectByIndex(4);
		WebElement dropdown1=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Thread.sleep(1000);
		Select sel1=new Select(dropdown1);
		Thread.sleep(1000);
		sel1.selectByIndex(3);
		WebElement dropdown2=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Thread.sleep(1000);
		Select sel2=new Select(dropdown2);
		Thread.sleep(1000);
		sel2.selectByIndex(10);
		Thread.sleep(1000);
		driver.quit();

		

		

	}

}
