package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleorMultiselect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vishn/OneDrive/Desktop/multiselect%20dropdown.html");
		Thread.sleep(1000);
		WebElement dropdown=driver.findElement(By.id("drop-down"));
		Thread.sleep(1000);
		Select sel=new Select(dropdown);
		if(sel.isMultiple())
		{
			System.out.println("MULTI SELECT");
		}
		else
		{
			System.out.println("SINGLE SELECT");

		}
		Thread.sleep(1000);
		driver.quit();

	}

}
