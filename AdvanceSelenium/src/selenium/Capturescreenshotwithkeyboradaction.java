package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturescreenshotwithkeyboradaction {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");		
        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_PRINTSCREEN);
        rbt.keyRelease(KeyEvent.VK_PRINTSCREEN);
        Thread.sleep(1000);
        for(int i=0;i<=3;i++)
        {
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        driver.quit();

	}

}
