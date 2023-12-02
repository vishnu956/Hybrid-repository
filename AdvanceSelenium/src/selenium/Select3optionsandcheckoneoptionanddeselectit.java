package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select3optionsandcheckoneoptionanddeselectit {

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
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("D");
		Thread.sleep(1000);
		sel.selectByVisibleText("Sharmila Mandre");
		Thread.sleep(1000);
        List<WebElement> selectedoptions=sel.getAllSelectedOptions();
        for(WebElement option:selectedoptions)
        {
        	String text=option.getText();
        	if(text.equals("Anushka Shetty"))
        			{
        		sel.deselectByVisibleText(text);
        			}
        			}
        Thread.sleep(1000);
        driver.quit();
        }
	}


