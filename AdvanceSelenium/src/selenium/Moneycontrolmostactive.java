package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moneycontrolmostactive {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(1000);
		WebElement Mostactcompany=driver.findElement(By.xpath("(//a[@title='Most Active']/../../following-sibling::div/div[2]/table/tbody/tr/td/a)[1]"));
		WebElement price=driver.findElement(By.xpath("(//a[@title='Most Active']/../../following-sibling::div/div[2]/table/tbody/tr/td[2])[1]"));
		WebElement change=driver.findElement(By.xpath("(//a[@title='Most Active']/../../following-sibling::div/div[2]/table/tbody/tr/td[3])[1]"));
		WebElement value=driver.findElement(By.xpath("(//a[@title='Most Active']/../../following-sibling::div/div[2]/table/tbody/tr/td[4])[1]"));

		String text=Mostactcompany.getText();
		String text1=price.getText();
		String text2=change.getText();
		String text3=value.getText();



		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);

		Thread.sleep(1000);
		driver.quit();

	}

}
