package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dhtmlgoodies 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
Thread.sleep(1000);
List<WebElement> capitals=driver.findElements(By.xpath("//div[@class='destinationBox']"));
List<WebElement> states=driver.findElements(By.xpath("//div[@id='answerDiv']/div"));

 Actions act=new Actions(driver);
 for(int i=0;i<=capitals.size()-1;i++)
 {
	 for(int j=0;j<=states.size()-1;j++)
	 { 
	 act.clickAndHold(states.get(j)).perform();
	 Thread.sleep(500);
    act.release(capitals.get(i)).build().perform();
	 
	 if(states.get(j).getCssValue("background-color").equals("rgba(255, 0, 0, 1)"))
	 {
		 act.clickAndHold(states.get(j)).build().perform();
		 Thread.sleep(500);
		 act.release(driver.findElement(By.xpath("//div[@id='answerDiv']"))).perform();
     }

	 else if(states.get(j).getCssValue("background-color").equals("rgb(0, 255, 0)"))
	 {
		 break;
	 }
	 }
	 states=driver.findElements(By.xpath("//div[@id='answerDiv']/div"));
 }
	}
}



