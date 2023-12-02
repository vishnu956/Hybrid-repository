package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetchalltextsindropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/dropdown");
		Thread.sleep(1000);
		WebElement country_dropdown=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Thread.sleep(1000);
		Select sel=new Select(country_dropdown);
	    List<WebElement> Options = sel.getOptions();
	    for(WebElement option:Options)
	    {
	    	String text=option.getText();
	    	System.out.println(text);
	    }
	    Thread.sleep(1000);
	    driver.quit();
	}

}
