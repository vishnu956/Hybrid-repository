package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRating {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vishnuk2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("smartphone");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Picture of Smartphone']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Add your review']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='AddProductReview.Title']")).sendKeys("My Review");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='review-text']")).sendKeys("best mobile to purchase");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addproductrating_4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='add-review']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(4000);
		driver.quit();

		}

}
