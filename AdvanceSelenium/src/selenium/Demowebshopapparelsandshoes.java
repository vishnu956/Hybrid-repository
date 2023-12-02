package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demowebshopapparelsandshoes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		Thread.sleep(1000);
		WebElement option1 = driver.findElement(By.id("products-orderby"));
		Thread.sleep(1000);
		Select sel = new Select(option1);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		WebElement option2 = driver.findElement(By.id("products-pagesize"));
		Thread.sleep(1000);
		Select sel1 = new Select(option2);
		sel1.selectByIndex(1);
		Thread.sleep(1000);
		WebElement option3 = driver.findElement(By.id("products-viewmode"));
		Thread.sleep(1000);
		Select sel2 = new Select(option3);
		sel2.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='page-title']/../div[2]/div[3]/div/div/div/a/img")).click();
		Thread.sleep(1000);
		WebElement option4 = driver.findElement(By.id("product_attribute_5_7_1"));
		Thread.sleep(1000);
		Select sel3 = new Select(option4);
		sel3.selectByIndex(3);
		Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-button-5")).click();
		Thread.sleep(1000);
		driver.quit();


		


	}

}
