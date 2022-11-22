package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.annotations.Test;

public class user extends demo
{
	
		@Test
		public void createuser() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[@class='content users']//img[@class='sizer']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@value='Create New User']")).click();
			Thread.sleep(500);
			driver.findElement(By.name("username")).sendKeys("veena");
			Thread.sleep(500);
			driver.findElement(By.name("passwordText")).sendKeys("1234");
			Thread.sleep(500);
			driver.findElement(By.name("passwordTextRetype")).sendKeys("1234");
			Thread.sleep(500);
			driver.findElement(By.name("firstName")).sendKeys("veena");
			Thread.sleep(500);
			driver.findElement(By.name("lastName")).sendKeys("s");
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		}
		@Test
		public void deleteuser() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[@class='content users']//img[@class='sizer']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//a[normalize-space()='s, sushma (sushma)']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
			Alert alt=driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
		}
}
