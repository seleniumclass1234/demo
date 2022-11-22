package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class customer extends demo
{
@Test
public void createcustomer() throws InterruptedException
{
	driver.findElement(By.xpath("//a[@class='content tasks']//img[@class='sizer']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//a[normalize-space()='Projects & Customers']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("name")).sendKeys("shree");
	Thread.sleep(2000);
	driver.findElement(By.name("description")).sendKeys("testing manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
	Thread.sleep(2000);
	WebElement wb=driver.findElement(By.xpath("//span[@class='successmsg']"));
	System.out.println(wb.getText());
}
@Test
public void deletecustomer() throws InterruptedException

{
	driver.findElement(By.xpath("//a[@class='content tasks']//img[@class='sizer']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//a[normalize-space()='Projects & Customers']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='customers[11]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='deleteButton']")).click();   
}
}
