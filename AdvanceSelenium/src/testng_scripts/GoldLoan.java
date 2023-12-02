package testng_scripts;

import org.testng.annotations.Test;

public class GoldLoan {
	@Test(groups= {"smoke","regress"})
	public void newGoldLoan()
	{
		System.out.println("for new gold--");
	}
	@Test(groups= {"regress"})
	public void PledgeLoan()
	{
		System.out.println("if you pledge your gold");
	}


}
