package PopupAlerts;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts 
{

	private static Alert alt;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;");
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@name='username']")));
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginbutton")).click();
		
		
		
		driver.findElement(By.xpath("//a[@class='content tasks']//img[@class='sizer']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//td[table[tbody[tr[td[a[text()='shalini']]]]]]/following-sibling::td[5]")).click();
		driver.findElement(By.xpath("//input[@name='customers[7]']")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
	
		Alerts.alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		 alt.accept();

	}

	
}
