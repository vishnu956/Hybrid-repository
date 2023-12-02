package testng_scripts;

import org.testng.annotations.Test;

public class EcomDomain1 
{
	@Test(priority=1)
	public void signup()
	{
		System.out.println("Account is created");
		}
	@Test(priority=2,invocationCount=5)
	public void login()
	{
		System.out.println("Successfully loggedin");
	}
	@Test(priority=3)
	public void Categoryandproducts()
	{
		System.out.println("Products page is displayed");
	}
	@Test(priority=4)
	public void Cart()
	{
		System.out.println("Added to cart");
	}
	@Test(priority=5)
	public void Payment()
	{
		System.out.println("Payment is successfull");
	}
	@Test(priority=6)
	public void orders()
	{
		System.out.println("item is displayed");
	}
	@Test(priority=7)
	public void logout()
	{
		System.out.println("Successfully loggedout....");
	}


}
