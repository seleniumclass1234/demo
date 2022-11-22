package sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(500);
		WebElement wb=driver.findElement(By.xpath("//input[@id='file-upload']"));
		Actions act=new Actions(driver);
		act.click(wb).perform();
		Thread.sleep(500);
		Runtime.getRuntime().exec("C:\\Users\\Shalu\\OneDrive\\Desktop\\sample.exe");
	}

}