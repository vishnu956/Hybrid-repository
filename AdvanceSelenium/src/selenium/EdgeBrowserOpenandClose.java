package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserOpenandClose {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
