package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comparepriceinshoppingcart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vishnuk2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[text()='Books']/../../div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[text()='Books']/../../div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[text()='Books']/../../div[2]/div[3]/div[5]/div[1]/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
		WebElement book1=driver.findElement(By.xpath("(//img[@alt='Picture of Computing and Internet'])[2]/../../td[4]/span[2]"));
		Thread.sleep(1000);
		WebElement book2=driver.findElement(By.xpath("(//img[@alt='Picture of Fiction'])[2]/../../td[4]/span[2]"));
		Thread.sleep(1000);
		WebElement book3=driver.findElement(By.xpath("(//img[@alt='Picture of Health Book'])[2]/../../td[4]/span[2]"));
		Thread.sleep(1000);
        String count1 = book1.getText();
        String count2 = book2.getText();
        String count3 = book3.getText();
        double x= Double.parseDouble(count1);
        double y= Double.parseDouble(count2);
        double z= Double.parseDouble(count3);
        double m= x+y+z;
        Thread.sleep(1000);
        double h = 44;
        System.out.println(m);
        System.out.println(h);
        Thread.sleep(1000);
        if(m==h)      {
        	System.out.println("Same Price");
        }
        else
        {
        	System.out.println("no match");
        }
        driver.quit();


	}

}
