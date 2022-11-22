package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class demo 
{
	public  WebDriver driver;
	@BeforeMethod
	public void login() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(500);
		driver.findElement(By.id("loginButton")).click();
		}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
	}
	}
