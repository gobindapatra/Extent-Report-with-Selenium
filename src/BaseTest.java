import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class BaseTest 
{
	public ChromeDriver driver;
	@BeforeClass(alwaysRun=true)
	   public  void startService() throws IOException
	   
	   {
		System.setProperty("webdriver.chrome.driver", "E://MyAppiumWorkPlace//ExtentReports//drivers//chromedriver.exe");
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	   }
	   

	public String getScreenShot(String testCaseName ,ChromeDriver driver) throws IOException
	   {
		  File source =  driver.getScreenshotAs(OutputType.FILE);
		  //String destination = System.getProperty("user.dir")+"//Extent Report//"+testCaseName+".png";
		 String destination = "E://MyAppiumWorkPlace//AppiumFrameworkDesign//Extent Report//"+testCaseName+".png";
		  FileUtils.copyFile(source, new File(destination));
		  return destination;
	   }
	@AfterClass(alwaysRun=true)
	   public void stopService()
	   {
		   driver.quit();
		 
		  
	   }

}
