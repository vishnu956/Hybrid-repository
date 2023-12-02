package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Addtocartfordemoweb {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement Electronics = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(Electronics).perform();
		Thread.sleep(1000);
		WebElement Cellphones = driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[1]"));
		Thread.sleep(1000);
        act.moveToElement(Cellphones).click().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Phone Cover']")).click();
        Thread.sleep(1000);
        WebElement Manufacturer=driver.findElement(By.xpath("//select[@id='product_attribute_80_2_37']"));
        Select sel=new Select(Manufacturer);
        sel.selectByIndex(1);
        Thread.sleep(1000);
        WebElement Color=driver.findElement(By.xpath("//select[@id='product_attribute_80_1_38']"));
        Select sel1=new Select(Color);
        sel1.selectByIndex(2);
        Thread.sleep(2000);
        WebElement data=driver.findElement(By.xpath("//input[@id='addtocart_80_EnteredQuantity']"));
        data.clear();
        Thread.sleep(1000);
        data.sendKeys("3");
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-80']")).click();
        Thread.sleep(2000);
        driver.quit();

	}

}
