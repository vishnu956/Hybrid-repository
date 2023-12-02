package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPriceindemoappsusingsingleloop {

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
		driver.findElement(By.xpath("//h1[text()='Books']/../../div[2]/div[3]/div[5]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		List<WebElement> Price_all=driver.findElements(By.xpath("//span[@class='product-subtotal']"));
		double data =0;
		for(WebElement Price:Price_all )
		{
			String overallprice = Price.getText();
			double x=Double.parseDouble(overallprice);
		 data = data+x;
			System.out.println(x);
	        
		}
		WebElement subtotal=driver.findElement(By.xpath("(//span[contains(text(),'Total')])[5]/../../td[2]/span/span"));
		String text=subtotal.getText();
		double g=Double.parseDouble(text);
		System.out.println(g);
		if(data==g){
			System.out.println("Same");
		}else {
			System.out.println("not same");
			
		}
		Thread.sleep(1000);
		driver.quit();
		}

	}

