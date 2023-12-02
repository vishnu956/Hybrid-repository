package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenYoutube 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	Thread.sleep(2000);
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();
}

}
