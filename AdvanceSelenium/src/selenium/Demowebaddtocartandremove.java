package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebaddtocartandremove {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vishnuk2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[text()='Books']/../../div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[text()='Books']/../../div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Picture of Computing and Internet']/../../td[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Picture of Fiction']/../../td[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(2000);
		driver.quit();

		

		

		


		

		



	}

}
