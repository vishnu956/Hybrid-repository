package Asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed());
		driver.findElement(By.xpath("//a[text()='Log in']"));
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("Dummydata");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
        String errormsg=driver.findElement(By.xpath("//span[@for='Email']")).getText();
        Thread.sleep(1000);
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(errormsg, "Please enter a valid email address");
        Thread.sleep(1000);

		driver.quit();
		soft.assertAll();
	}


}
