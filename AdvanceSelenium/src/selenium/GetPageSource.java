package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSource 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com");
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		String src_code = driver.getPageSource();
		Thread.sleep(2000);
		if(src_code.contains("Login"))
		{
			System.out.println("Login is present");
		}
		else
		{
			System.out.println("Login is not present");
		}
		driver.quit();
	}
}
