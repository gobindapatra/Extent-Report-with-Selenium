import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testCase_1	extends BaseTest
{


	@Test(enabled = false) 
	public void verifyTitle()
	{
	
		
	    driver.get("https://www.redbus.in/");
	    String ActutalTitle = driver.getTitle();
	    Assert.assertEquals(ActutalTitle,"Red Bus" );
	}

	@Test
	public void testDemo() throws InterruptedException, AWTException
	{

		
	    driver.get("https://www.redbus.in/");

	    driver.manage().window().maximize();


	    WebElement   FromElement	 = driver.findElement(By.id("src"));
	    FromElement.sendKeys("Hyderabad");
	    Thread.sleep(5000);

	    Robot key = new Robot();
	    key.keyPress(KeyEvent.VK_ENTER);


	    WebElement   ToElement = driver.findElement(By.id("dest"));
	    ToElement.sendKeys("Delhi");
	    Thread.sleep(5000);
	    key.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    key.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(10000);
	    
	    
	    WebElement   date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
	   // 
	    date.sendKeys("27-Apr-2023");
	    Thread.sleep(5000);

	    //27-Apr-2023
	    
	    








	}

}
