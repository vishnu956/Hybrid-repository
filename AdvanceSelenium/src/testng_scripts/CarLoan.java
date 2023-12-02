package testng_scripts;

import org.testng.annotations.Test;

public class CarLoan {
	@Test(groups= {"smoke","regress"})
    public void newCarLoan()
	{
		System.out.println("for new car--");
	}
	@Test(groups= {"regress"})
	public void oldCarLoan()
	{
		System.out.println("for old car--");
	}


}
