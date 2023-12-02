package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class DemoQaForm {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vishnu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Palani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("vishnusams@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9108674854");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Computer Science");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Bengaluru Karnataka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();


	}

}
