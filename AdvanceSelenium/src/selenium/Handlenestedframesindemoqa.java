package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlenestedframesindemoqa {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		WebElement frm1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frm1);
		WebElement text1=driver.findElement(By.xpath("//body"));
		String text=text1.getText();
		System.out.println(text);
		Thread.sleep(1000);
		//WebElement frm2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(0);
        WebElement text2=driver.findElement(By.xpath("//body"));
		String txt=text2.getText();
		System.out.println(txt);
		Thread.sleep(1000);

		driver.close();


	}

}
