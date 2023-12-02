package testng_scripts;

import org.testng.annotations.Test;

public class HomeLoan {
	@Test(groups= {"smoke","regress"})
	public void newHomeLoan()
	{
		System.out.println("for new house--");
	}
	@Test(groups= {"regress"})
	public void oldHomeLoan()
	{
		System.out.println("for old house--");
	}


}
