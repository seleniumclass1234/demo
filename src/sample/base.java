package sample;

import java.security.PublicKey;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class base 
{
@BeforeTest
public void startserver()

{
System.out.println("Run app server code & set browser settings");
}
@AfterTest
public void endserver()
{
	System.out.println("end the server");
}

@BeforeClass
public void dbconnection()
{
System.out.println("connect to db");
}

@AfterClass
public void closedb()
{
System.out.println("close the db");
}
@BeforeMethod
public void login()
{
	System.out.println("login to app");
}
@AfterMethod
public void logout()
{
	System.out.println("logout from app");
}

}


