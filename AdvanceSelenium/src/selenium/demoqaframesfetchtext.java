package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaframesfetchtext {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		WebElement frm1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frm1);
		WebElement txt1=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		String text=txt1.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		WebElement frm2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frm2);
		WebElement txt2=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		String text1=txt2.getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.close();


	}

}
