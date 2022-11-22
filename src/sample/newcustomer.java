package sample;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class newcustomer 
{

	@Test(priority = -1,enabled = false)
	public void createcustomer()
	{
		System.out.println("create customer");
	}

	@Test(priority = 0)
	public void deletecustomer()
	{
		System.out.println("delete customer");
	}
	
	@Test(priority = 1)
	public void modifycustomer()
	{
		System.out.println("modify customer");
	}
	
	}