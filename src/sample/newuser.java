package sample;

import org.testng.annotations.Test;

public class newuser
{
	@Test(priority = -1,enabled = false)
	public void createuser()
	{
		System.out.println("create user");
	}

	@Test(priority = 0)
	public void deleteuser()
	{
		System.out.println("delete user");
	}
	@Test(priority = 1)
	public void modifyuser()
	{
		System.out.println("modify user");
	}
	
}
