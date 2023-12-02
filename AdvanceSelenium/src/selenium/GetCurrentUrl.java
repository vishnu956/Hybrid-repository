package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
