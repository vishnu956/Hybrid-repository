package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class MSEddgeBrowserLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		// TODO Auto-generated method stub

	}

}
